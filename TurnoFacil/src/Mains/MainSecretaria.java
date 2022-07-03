package Mains;

import java.util.ArrayList;
import java.util.Scanner;

import Apps.AppSecretaria;
import Clases.*;

public class MainSecretaria {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static AppSecretaria crearApp(Secretaria sec) { //método privado para crear y retornar una instancia de AppSecretaria necesaria para el testeo
		//Médicos
		Medico m1 = new Medico("Hector","Salamanca","Traumatologia","HSal","1563",965874);
		Medico m2 = new Medico("Mariana","Lopez","Cardiologia","MLop","1472",126578);
		Medico m3 = new Medico("Aaron","Perez","Odontologia","APez","1225",167943);
		Medico m4 = new Medico("Mariano","Gonzales","Pediatria","MGon","4569",157942);
		sec.addMedico(m1);
		sec.addMedico(m2);
		sec.addMedico(m3);
		sec.addMedico(m4);
		AppSecretaria app = new AppSecretaria();
		app.addSecretariaActivo(sec);
		return app;
	}

	public static void main(String[] args) { //main de la Secretaria que permite utilizar los métodos de la AppSecretaria a través de un menú y con el mismo testear el código
		System.out.println("*************** Turno Facil Secretaria ***************");
		//Secretaria
		Secretaria sec = new Secretaria("Patricia", "Suarez", "xxxx", "xxxx", 14758);
		AppSecretaria app = crearApp(sec); //crearApp recibe la Secretaria sec por parámetro para que luego se puedan invocar métodos de la misma para el testeo
		int eleccion = 1;
		while (eleccion < 4 && eleccion > 0) {
			System.out.println("=========> Menu <=========");
			System.out.println(" 1- Para cargar los dias y horarios de los medicos " + "\n" + " 2- Para cargar los turnos de un medico");
			System.out.println(" 3- Para dar de baja un turno " + "\n" + " Otro numero para Salir");
			System.out.println("Ingrese la opcion: ");
			eleccion = sc.nextInt();
			sc.nextLine();
			switch(eleccion) {
				case 1: {
						app.cargarDiasYHorarios();
						ArrayList<Medico> medicos = sec.listarMedicos();
						for (Medico medico: medicos) {
							System.out.println("Medico: " + medico);
							ArrayList<JornadaDiaria> jornadas = medico.getJornadas();
							if (jornadas.size() > 0) {
								System.out.println("Jornadas:");
								for (JornadaDiaria jornada: jornadas)
									System.out.println(jornada); //se imprimen las jornadas por cada médico para testear y saber si funciona correctamente el código
							}
							else
								System.out.println("El medico no posee jornadas"); //si un médico no posee jornadas se avisa por pantalla para facilitar el testeo
						}
				}
						break;
				case 2: {
						app.cargarTurnosMedico();
						ArrayList<ParMedicoTurnos> pares = sec.listarPares();
						System.out.println("Turnos cargados:");
						for (ParMedicoTurnos par: pares) {
							ArrayList<Turno> turnos = par.getTurnos();
							for (Turno turno: turnos)
								System.out.println(turno); //se imprimen todos los turnos (sin separar por médico ya que al imprimir el turno ya se avisa a cuál médico corresponde) para testear y saber si funciona correctamente el código
						}	
				}
						break;
				case 3: {
						app.borrarTurno();
						ArrayList<ParMedicoTurnos> pares = sec.listarPares();
						System.out.println("Turnos cargados:");
						for (ParMedicoTurnos par: pares) {
							ArrayList<Turno> turnos = par.getTurnos();
							for (Turno turno: turnos)
								System.out.println(turno); //se imprimen todos los turnos (sin separar por médico ya que al imprimir el turno ya se avisa a cuál médico corresponde) para testear y saber si funciona correctamente el código
						}
				}
						break;
				default: System.out.println("Fin de la ejecucion");
			}
		}
	}

}
