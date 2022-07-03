package Apps;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import Clases.*;
import Filtros.*;

public class AppSecretaria {
	private static ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>();
	private Secretaria secretariaActivo = null;
	private static Scanner sc = new Scanner(System.in);
	
	public void addSecretariaActivo(Secretaria sec) { //método que inicializa la secretaria activa (la que se encuentra utilizando la app)
		if (sec != null)
			this.secretariaActivo = sec;
	}
	
	private LocalTime devolverHora() { //método para llevar a cabo la elección de un horario (hora y minutos) y retornar un LocalTime representando al mismo
		System.out.println("Ingrese la hora: ");
		int hora = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese los minutos: ");
		int minutos = sc.nextInt();
		sc.nextLine();
		return LocalTime.of(hora, minutos);
	}
	
	private int elegirMedico(ArrayList<Medico> medicos) { //método para elegir un médico de un ArrayList de médicos
		System.out.println("Medicos que usted tiene asignados: ");
		for (int i = 0; i < medicos.size(); i++)
			System.out.println(i+1 + "- " + medicos.get(i)); //se imprimen los médicos y las posiciones de los mismos en el ArrayList aumentadas en 1 (1 al tamaño del ArrayList) por cuestiones de diseño
		int eleccion = 0;
		while (eleccion < 1 || eleccion > medicos.size()) {
			System.out.println("Seleccione un medico de la lista (ingrese un numero entre 1 " + "y " + medicos.size() + ")");
			eleccion = sc.nextInt();
			sc.nextLine();
			if (eleccion < 1 || eleccion > medicos.size())
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
			return eleccion-1; //se retorna ubicación real del médico elegido en el ArrayList, o sea la elegida menos 1
	}
	
	private int elegirTurno(ArrayList<Turno> turnos) { //método para elegir un turno de un ArrayList de turnos, con las mismas consideraciones de diseño que para elegirMedico
		System.out.println("Turnos correspondientes al medico elegido: ");
		for (int i = 0; i < turnos.size(); i++)
			System.out.println(i+1 + "- " + turnos.get(i));
		int eleccion = 0;
		while (eleccion < 1 || eleccion > turnos.size()) {
			System.out.println("Seleccione un turno de la lista (ingrese un numero entre 1 " + "y " + turnos.size() + ")");
			eleccion = sc.nextInt();
			sc.nextLine();
			if (eleccion < 1 || eleccion > turnos.size())
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
		return eleccion-1;
	}
	
	private int menuDiaSemana() { //método para solicitar un día de semana al usuario (se retorna un entero del 1 al 7 pero este corresponde a un día de la semana en particular)
		System.out.println("Ingrese el numero de dia de semana de la jornada a agregar (1-LUNES, 2-MARTES, 3-MIERCOLES, 4-JUEVES, 5-VIERNES, 6-SABADO, 7-DOMINGO): ");
		int dia = sc.nextInt();
		sc.nextLine();
		while (dia < 1 || dia > 7) {
			System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
			System.out.println("Ingrese el numero de dia de semana de la jornada a agregar (1-LUNES, 2-MARTES, 3-MIERCOLES, 4-JUEVES, 5-VIERNES, 6-SABADO, 7-DOMINGO): ");
			dia = sc.nextInt();
			sc.nextLine();
		}
		return dia;
	}
	
	private void cargarDiaYHorario(int pos_medico) { //método para crear y cargar una jornada en particular a la secretaria activa
		int dia_semana = menuDiaSemana();
		System.out.println("A continuacion podra ingresar hora y minutos de inicio de la jornada");			
		LocalTime hora_inicio = devolverHora();
		System.out.println("A continuacion podra ingresar hora y minutos de fin de la jornada");
		LocalTime hora_fin = devolverHora();
		secretariaActivo.cargarDiasYHorarios(new JornadaDiaria(dia_semana, hora_inicio, hora_fin), pos_medico); //además de pos_medico, se pasa por parámetro la jornada con los datos de la misma que fueron solicitados
		//pos_medico es la ubicación del médico en el ArrayList de médicos y la del par que deberá utilizarse
	}
	
	public void cargarDiasYHorarios() { //método para cargar las jornadas deseadas
		ArrayList<Medico> medicos = secretariaActivo.listarMedicos();
		if (medicos.size() > 0) {
			cargarDiaYHorario(elegirMedico(medicos)); //se pasa la posición en el ArrayList de médicos del que se eligió
			System.out.println("Si desea ingresar mas jornadas ingrese una s, de lo contrario ingrese cualquier otro caracter: ");
			String respuesta = sc.nextLine();
			while (respuesta.equals("s")) {
				cargarDiaYHorario(elegirMedico(medicos));
				System.out.println("Si desea ingresar mas jornadas ingrese una s, de lo contrario ingrese cualquier otro caracter: ");
				respuesta = sc.nextLine();
			}
		}
		else
			System.out.println("Usted no posee medicos asignados"); //si la secretaria que se encuentra trabajando con la app no posee médicos asociados se le informa de ello
	}
	
	private void cargarTurno(int pos_medico, Medico medico) { //método para crear y cargar un turno en particular a la secretaria activa
		System.out.println("Ingrese el dia de la fecha del turno: ");
		int dia_fecha = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el mes de la fecha del turno: ");
		int mes_fecha = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el anio de la fecha del turno: ");
		int anio_fecha = sc.nextInt();
		sc.nextLine();
		int hora_fecha = -1;
		while (hora_fecha < 0 || hora_fecha > 23) {
			System.out.println("Ingrese la hora de la fecha del turno (0 a 23): ");
			hora_fecha = sc.nextInt();
			sc.nextLine();
			if (hora_fecha < 0 || hora_fecha > 24)
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
		int minutos_fecha = -1;
		while (minutos_fecha < 0 || minutos_fecha > 59) {
			System.out.println("Ingrese los minutos de la fecha del turno (0 a 59): ");
			minutos_fecha = sc.nextInt();
			sc.nextLine();
			if (minutos_fecha < 0 || minutos_fecha > 59)
				System.out.println("Ingreso un valor invalido, por favor vuelva a intentarlo");
		}
		System.out.println("Ingrese el costo del turno: ");
		int costo = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese la duracion del turno: ");
		int duracion = sc.nextInt();
		sc.nextLine();
		Turno turno = new Turno(LocalDateTime.of(anio_fecha, mes_fecha, dia_fecha, hora_fecha, minutos_fecha), medico, costo, duracion);
		secretariaActivo.cargarTurnosMedico(turno, pos_medico); //además de pos_medico, se pasa por parámetro el turno con los datos del mismo que fueron solicitados
		//pos_medico es la ubicación del médico en el ArrayList de médicos y la del par que deberá utilizarse
	}
	
	public void cargarTurnosMedico() { //método para cargar los turnos deseados
		ArrayList<Medico> medicos = secretariaActivo.listarMedicos();
		if (medicos.size() > 0) {
			int pos_medico = elegirMedico(medicos);
			Medico medico = medicos.get(pos_medico);
			cargarTurno(pos_medico, medico);
			System.out.println("Si desea ingresar mas turnos ingrese una s, de lo contrario ingrese cualquier otro caracter: ");
			String respuesta = sc.nextLine();
			while (respuesta.equals("s")) {
				pos_medico = elegirMedico(medicos);
				medico = medicos.get(pos_medico);
				cargarTurno(pos_medico, medico);
				System.out.println("Si desea ingresar mas turnos ingrese una s, de lo contrario ingrese cualquier otro caracter: ");
				respuesta = sc.nextLine();
			}
		}
		else
			System.out.println("Usted no posee medicos asignados"); //si la secretaria que se encuentra trabajando con la app no posee médicos asociados se le informa de ello
	}
	
	public void borrarTurno() { //método que permite borrar un turno (ya sea que esté ocupado o no)
		ArrayList<Medico> medicos = secretariaActivo.listarMedicos();
		if (medicos.size() > 0) {
			int eleccion_medico = elegirMedico(medicos);
			ArrayList<Turno> turnos = secretariaActivo.getTurnosMedico(medicos.get(eleccion_medico));
			if (turnos.size() > 0) {
				int eleccion_turno = elegirTurno(turnos);
				Paciente p = turnos.get(eleccion_turno).getPaciente();
				secretariaActivo.cancelarTurno(eleccion_medico, eleccion_turno); //se pasa la ubicación del médico en el ArrayList de médicos (la misma que la del par requerido en el ArrayList de pares) y la del turno dentro del ArrayList de turnos para la cancelación
				if (p != null) //ya que el turno puede no estar asociado a ningún paciente
					System.out.println("Se ha cancelado el turno de: " + p.getNombre() + " " + p.getApellido() + " - DNI: " + p.getDNI()); //en este caso se informan los datos del paciente que tenía asignado el turno
				else
					System.out.println("El turno eliminado no habia sido reservado por ningun paciente"); //en este caso se informa que el turno eliminado no estaba asociado a ningún paciente
			}
			else
				System.out.println("El medico elegido no posee turnos asociados"); //si el médico no tenía turnos asociados se informa de ello
		}
		else
			System.out.println("Usted no posee medicos asignados"); //si la secretaria que se encuentra trabajando con la app no posee médicos asociados se le informa de ello
	}
}
