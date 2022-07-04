package Mains;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import Apps.AppPaciente;
import Clases.*;

public class MainPaciente {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static AppPaciente crearApp() { //método privado para crear y retornar una instancia de AppPaciente necesaria para el testeo
		SistemaGeneralClinica SGC = new SistemaGeneralClinica("Clinica");
		//Secretarias
		Secretaria s1 = new Secretaria("Maria","Fernandez","MFer","1245",123456);
		Secretaria s2 = new Secretaria("Juan","Perez","JPer","1478",147852);
		SGC.addSecretaria(s1);
		SGC.addSecretaria(s2);
		//Medicos
		Medico m1 = new Medico("Hector","Salamanca","Traumatologia","HSal","1563",965874);
		Medico m2 = new Medico("Mariana","Lopez","Cardiologia","MLop","1472",126578);
		Medico m3 = new Medico("Aaron","Perez","Odontologia","APez","1225",167943);
		s1.addMedico(m1);
		s2.addMedico(m2);
		s1.addMedico(m3);
		//Turnos
		s1.addTurno(m1, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(15, 0)), m1, 100, 30));
		s1.addTurno(m1, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(15, 30)), m1, 100, 60));
		s1.addTurno(m3, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(20, 30)), m3, 100, 60));
		s1.addTurno(m3, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(21, 0)), m3, 100, 30));
		s2.addTurno(m2, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(10, 0)), m2, 100, 30));
		s2.addTurno(m2, new Turno(LocalDateTime.of(LocalDate.of(2022, 8, 15), LocalTime.of(11, 0)), m2, 100, 30));
		//Jornadas
		m1.addJornada(new JornadaDiaria(3, LocalTime.of(15, 0), LocalTime.of(20, 0)));
		m2.addJornada(new JornadaDiaria(2, LocalTime.of(10, 0), LocalTime.of(12, 0)));
		m3.addJornada(new JornadaDiaria(5, LocalTime.of(19, 0), LocalTime.of(22, 0)));
		//Obras Sociales
		m1.addOS(new ObraSocial("Osde", 80));
		m2.addOS(new ObraSocial("Ioma", 120));
		m3.addOS(new ObraSocial("Pami", 100));
		return new AppPaciente(SGC);
	}

	public static void main(String[] args) { //main del Paciente que permite utilizar los métodos de la AppPaciente a través de un menú y con el mismo testear el código
		System.out.println("*************** Turno Facil ***************");
		AppPaciente ap = crearApp();
		ap.addPacienteActivo(new Paciente("Santiago","Diaz","9 de julio 855","2494124578","sandiaz@gmail.com",159628,2244,new ObraSocial("Osde", 80)));
		int eleccion = 1;
		while (eleccion == 1) { //ya que por el momento solo se llevan a cabo funcionalidades correspondientes a sacar un turno
			System.out.println("=========> Menu <=========");
			System.out.println(" 1- Para obtener un Turno " + "\n" + " Otro numero para Salir");
			System.out.println("Ingrese la opcion: ");
			eleccion = sc.nextInt();
			sc.nextLine();
			switch(eleccion) {
				case 1: ap.sacarTurno();
				default: System.out.println("Fin de la ejecucion");
			}
		}
	}
}