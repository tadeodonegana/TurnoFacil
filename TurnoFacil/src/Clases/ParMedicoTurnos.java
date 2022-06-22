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
