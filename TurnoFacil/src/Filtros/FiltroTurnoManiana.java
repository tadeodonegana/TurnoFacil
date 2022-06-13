package Filtros;

import java.time.LocalTime;

import Clases.Turno;

public class FiltroTurnoManiana extends FiltroTurno{
	
	public FiltroTurnoManiana() {
	}
	
	public boolean cumple(Turno turno) {
		if (turno != null) {
			int horaTurno = turno.getFechaYHora().getHour();
			return horaTurno < 12;
		}
		return false;
	}
}
