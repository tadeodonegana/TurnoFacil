package Clases;

import java.util.ArrayList;
import Filtros.*;

public class Secretaria {
	private  String nombre, apellido, usuario, clave;
	private int DNI;
	private ArrayList<ParMedicoTurnos> servicios;
	
	public Secretaria(String nombre, String apellido, String usuario, String clave, int DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.DNI = DNI;
		this.servicios = new ArrayList<ParMedicoTurnos>();
	}
	
	public ArrayList<ParMedicoTurnos> buscarParesMedicoTurnos(FiltroMedico fm, FiltroTurno ft) {
		ArrayList<ParMedicoTurnos> resultado_filtrado = new ArrayList<ParMedicoTurnos>();
		for (ParMedicoTurnos par: servicios) {
			Medico medico = par.getMedico();
			if (fm.cumple(medico)) {
				ParMedicoTurnos p = new ParMedicoTurnos(medico);
				ArrayList<Turno> turnos = par.getTurnos();
				for (Turno turno: turnos)
					if (ft.cumple(turno) && turno.getPaciente() == null)
						p.addTurno(turno);
				resultado_filtrado.add(p);
			}
		}
		return resultado_filtrado;
	}
}
