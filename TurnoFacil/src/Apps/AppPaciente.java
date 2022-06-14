package Apps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import Clases.*;
import Filtros.*;
import java.util.Scanner;

public class AppPaciente {
	private static ArrayList<Paciente> listaPacientes = new ArrayList<>();
	private Paciente pacienteActivo = null;
	private SistemaGeneralClinica sistema;
	private static Scanner sc = new Scanner(System.in);
	
	public AppPaciente(SistemaGeneralClinica sistema) {
		assert(sistema != null);
		this.sistema = sistema;
	}
	
	private int elegir() {
		int eleccion = -1;
		while (eleccion < 1 || eleccion > 4) {
			System.out.println("Ingrese la opcion: ");
			eleccion = sc.nextInt();
			sc.nextLine();
			if (eleccion < 1 || eleccion > 4)
				System.out.println("Ha ingresado una opcion invalida, vuelva a intentarlo");
		}
		return eleccion;
	}
	
	private FiltroMedico MenuFiltroMedico() {
		System.out.println("A continuacion podra indicar si desea filtrar los medicos por nombre y apellido(1), especialidad(2), obra social(3) o ningun criterio(4)");
		int eleccion = elegir();
		switch(eleccion) {
		case 1: {
			System.out.println("Ingrese el nombre y apellido: ");
			String nombre = sc.nextLine();
			return new FiltroNombre(nombre);
			}
		case 2: {
			System.out.println("Ingrese la especialidad: ");
			String especialidad = sc.nextLine();
			return new FiltroEspecialidad(especialidad);
			}
		case 3: {
			System.out.println("Ingrese el nombre de la obra social: ");
			String obra_social = sc.nextLine();
			return new FiltroObraSocial(obra_social);
			}
		case 4: return null;
		}
		return null;
	}
	
	private FiltroTurno MenuFiltroTurno() {
		System.out.println("A continuacion podra indicar si desea filtrar los turnos por turno maï¿½ana(1), turno tarde(2), rango de fechas(3) o ningun criterio(4)");
		int eleccion = elegir();
		switch(eleccion) {
		case 1: return new FiltroTurnoManiana();
		case 2: return new FiltroTurnoTarde();
		case 3: {
			System.out.println("Ingrese el dia de la fecha inferior: ");
			int dia_fecha = sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese el mes de la fecha inferior: ");
			int mes_fecha = sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese el mes de la fecha inferior: ");
			int anio_fecha = sc.nextInt();
			sc.nextLine();
			LocalDateTime fecha_inferior = LocalDateTime.of(anio_fecha, mes_fecha, dia_fecha, 0, 0);
			System.out.println("Ingrese la fecha superior: ");
			System.out.println("Ingrese el dia de la fecha superior: ");
			dia_fecha = sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese el mes de la fecha superior: ");
			mes_fecha = sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese el mes de la fecha superior: ");
			anio_fecha = sc.nextInt();
			sc.nextLine();
			LocalDateTime fecha_superior = LocalDateTime.of(anio_fecha, mes_fecha, dia_fecha, 23, 59);
			return new FiltroRangoFechas(fecha_inferior, fecha_superior);
			}
		case 4: return null;
		}
		return null;
	}
	
	public void sacarTurno() {
		FiltroMedico fm = MenuFiltroMedico();
		FiltroTurno ft = MenuFiltroTurno();
		ArrayList<ParMedicoTurnos> resultado_filtrado = sistema.buscarParesMedicoTurnos(fm, ft);
		if (resultado_filtrado.size() > 0) {
			ArrayList<Medico> medicos = new ArrayList<Medico>();
			for (ParMedicoTurnos par: resultado_filtrado)
				medicos.add(par.getMedico());
			int posicion_medico = this.seleccionarMedico(medicos);
			ArrayList<Turno> listaTurnos = resultado_filtrado.get(posicion_medico).getTurnos();
			if (!listaTurnos.isEmpty()) {
				Turno turno_seleccionado = this.seleccionarTurno(listaTurnos);
				if (confirmaTurno()) {
					turno_seleccionado.setPaciente(pacienteActivo);
					pacienteActivo.addTurno(turno_seleccionado);
					this.alertar(turno_seleccionado);
				}
				else
					System.out.println("Los datos ingresados son incorrectos");
			}
			else {
				System.out.println("No hay turnos disponibles para el medico seleccionado");
			}
		}
		else
			System.out.println("Ningun medico cumple con el criterio indicado");
	}
	
	private int seleccionarMedico(ArrayList<Medico> medicos) {
		System.out.println("Medicos que cumplen con el filtrado:");
		for (int i = 0; i < medicos.size(); i++)
			System.out.println(i+1 + "- " + medicos.get(i));
		while (true) {
			System.out.println("Seleccione un medico de la lista (ingrese un numero entre 1 " + "y " + medicos.size() + ")");
			int eleccion = sc.nextInt();
<<<<<<< HEAD
			if (eleccion >= 1 && eleccion <= medicos.size()) {
				ArrayList<JornadaDiaria> imprimir = medicos.get(eleccion-1).getJornadas();
				System.out.println("Dias y Horarios que trabaja el médico" + " " + medicos.get(eleccion-1).getNombreYApellido());
				for(JornadaDiaria jd: imprimir) {
					System.out.println(jd.toString());
				}
=======
			sc.nextLine();
			if (eleccion >= 1 && eleccion <= medicos.size())
>>>>>>> e3ab4208ccc7c9f7f889e54b9f7798de529db640
				return eleccion-1;
			} else
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
	}
	
	private Turno seleccionarTurno(ArrayList<Turno> turnos) {
		System.out.println("Turnos correspondientes al medico seleccionado que cumplen con el filtrado:");
		for (int i = 0; i < turnos.size(); i++)
			System.out.println(i+1 + "- " + turnos.get(i));
		while (true) {
			System.out.println("Seleccione un medico de la lista (ingrese un numero entre 1 " + "y " + turnos.size() + ")");
			int eleccion = sc.nextInt();
			sc.nextLine();
			if (eleccion >= 1 && eleccion <= turnos.size())
				return turnos.get(eleccion-1);
			else
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
	}
	
	public boolean confirmaTurno() {
		System.out.println("Ingresar Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingresar Apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Ingresar Direccion: ");
		String direccion = sc.nextLine();
		System.out.println("Ingresar Email: ");
		String email = sc.nextLine();
		System.out.println("Ingresar Telefono: ");
		String telefono = sc.nextLine();
		System.out.println("Ingresar Numero de Afiliado: ");
		int numAfiliado = sc.nextInt();
		sc.nextLine();
		if (nombre.equals(pacienteActivo.getNombre()) && apellido.equals(pacienteActivo.getApellido()) && direccion.equals(pacienteActivo.getDireccion()) && email.equals(pacienteActivo.getEmail()) && telefono.equals(pacienteActivo.getTelefono()) && numAfiliado == pacienteActivo.getNumAfiliado()) {
			ObraSocial obra = pacienteActivo.getObraSocial();
			if (obra != null) {
				System.out.println("Ingresar Obra Social: ");
				String obraSocial = sc.nextLine();
				if (obra.getNombre().equals(obraSocial))
					return true;
			}
			else
				return true;
		}
		return false;
	}
	
	public void enviarMail() {
		System.out.println("Se han enviado los detalles del turno por mail");
	}
	
	public void imprimir(Turno turno) {
		System.out.println(turno.toString());
	}
	
	private void alertar(Turno turno_seleccionado) {
		System.out.println("El costo de este turno es de: " + turno_seleccionado.getCosto());
		ObraSocial obra = pacienteActivo.getObraSocial();
		Medico medico = turno_seleccionado.getMedico();
		if (obra != null) {
			if (medico.trabajaConOS(obra)) {
				if (obra.getMontoCubre() < turno_seleccionado.getCosto())
					System.out.println("ADVERTENCIA: El costo del turno no es cubierto totalmente por la obra social, teniendo una diferencial de: " + (turno_seleccionado.getCosto() - obra.getMontoCubre()));
				else
					System.out.println("La obra social que usted posee cubre todo el costo del turno, por lo que no debera abonar dinero");
			}
			else
				System.out.println("ADVERTENCIA: El medico seleccionado no atiende por la obra social que usted posee, por lo que debera abonar el costo total indicado");
		}
		else
			System.out.println("ADVERTENCIA: Usted no posee obra social, por lo que debera abonar el costo total del turno");
	}
}
