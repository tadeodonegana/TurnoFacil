package Filtros;

import Clases.Turno;

public class FiltroTurnoTarde extends FiltroTurno{
	
	public FiltroTurnoTarde() {
	}
	//Mediante este metodo se controla si cierto turno se da a la tarde o no
	//(en caso de que la hora sea mayor o igual a las 12, ya pertenece a la tarde)
	public boolean cumple(Turno turno) {
		if (turno != null) {
			int horaTurno = turno.getFechaYHora().getHour();
			return horaTurno >= 12;
		}
		return false;
	}
}