package Clases;

import java.util.ArrayList;

public class ParMedicoTurnos {
	private Medico medico;
	private ArrayList<Turno> turnos;
	
	public ParMedicoTurnos(Medico medico) {
		assert(medico != null);
		this.medico = medico;
		this.turnos = new ArrayList<Turno>();
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	public ArrayList<Turno> getTurnosDisponibles() {
		return turnos;
	}
	
	public void addTurno(Turno t) {
		if (!turnos.contains(t))
			turnos.add(t);
	}
}
