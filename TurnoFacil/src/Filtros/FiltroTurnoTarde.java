package Filtros;

import Clases.Turno;

public class FiltroTurnoTarde extends FiltroTurno{
	
	public FiltroTurnoTarde() {
	}

	public boolean cumple(Turno turno) {
		if (turno != null) {
			int horaTurno = turno.getFechaYHora().getHour();
			return horaTurno >= 12;
		}
		return false;
	}
}
