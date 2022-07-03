package Clases;

import java.util.ArrayList;
import java.util.Objects;

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
	
	public ArrayList<Turno> getTurnos() {
		return turnos;
	}
	
	public boolean poseeTurnoQueCruza(Turno turno) {//este método sirve para identificar si a la hora de agregar un turno se cruza con otro del mismo medico
		int i = 0;
		while (i < turnos.size()) {
			if (turnos.get(i).seCruzaCon(turno))
				return true;
			else
				i++;
		}
		return false;
	}
	
	public void addTurno(Turno t) {
		if (!turnos.contains(t))
			turnos.add(t);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParMedicoTurnos other = (ParMedicoTurnos) obj;
		return this.medico.equals(other.getMedico());
	}
}