package Apps;

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
	
	public void sacarTurno(FiltroMedico fm, FiltroTurno ft) {
		ArrayList<ParMedicoTurnos> resultado_filtrado = sistema.buscarParesMedicoTurnos(fm, ft);
		if (resultado_filtrado != null) {
			ArrayList<Medico> medicos = new ArrayList<Medico>();
			for (ParMedicoTurnos par: resultado_filtrado)
				medicos.add(par.getMedico());
			int posicion_medico = this.seleccionarMedico(medicos);
			Turno turno_seleccionado = this.seleccionarTurno(resultado_filtrado.get(posicion_medico).getTurnosDisponibles());
			if (confirmaTurno()) {
				turno_seleccionado.setPaciente(pacienteActivo);
				pacienteActivo.addTurno(turno_seleccionado);
				this.alertar(turno_seleccionado);
			}
			else
				System.out.println("Los datos ingresados son incorrectos");
		}
		else
			System.out.println("Ningun medico cumple con el criterio indicado");
	}
	
	private int seleccionarMedico(ArrayList<Medico> medicos) {
		System.out.println("Medicos que cumplen con el filtrado:");
		for (int i = 0; i < medicos.size(); i++)
			System.out.println(i+1 + "- " + medicos.get(i));
		while (true) {
			System.out.println("Seleccione un medico de la lista (ingrese un numero entre 1 " + "y " + medicos.size());
			int eleccion = sc.nextInt();
			if (eleccion >= 1 && eleccion <= medicos.size())
				return eleccion-1;
			else
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
	}
	
	private Turno seleccionarTurno(ArrayList<Turno> turnos) {
		System.out.println("Turnos correspondientes al medico seleccionado que cumplen con el filtrado:");
		for (int i = 0; i < turnos.size(); i++)
			System.out.println(i+1 + "- " + turnos.get(i));
		while (true) {
			System.out.println("Seleccione un medico de la lista (ingrese un numero entre 1 " + "y " + turnos.size());
			int eleccion = sc.nextInt();
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
		if (nombre == pacienteActivo.getNombre() && apellido == pacienteActivo.getApellido() && direccion == pacienteActivo.getDireccion() && email == pacienteActivo.getEmail() && telefono == pacienteActivo.getTelefono() && numAfiliado == pacienteActivo.getNumAfiliado()) {
			ObraSocial obra = pacienteActivo.getObraSocial();
			if (obra != null) {
				System.out.println("Ingresar Obra Social: ");
				String obraSocial = sc.nextLine();
				if (obra.getNombre() == obraSocial)
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
