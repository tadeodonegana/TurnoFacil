package Filtros;

import java.time.LocalTime;
import Clases.Turno;

public class FiltroTurnoManiana extends FiltroTurno{
	
	public FiltroTurnoManiana() {
	}
	
	public boolean cumple(Turno turno) { //Verifica que un turno se vaya a realizar a la ma ana  
		if (turno != null) {
			int horaTurno = turno.getFechaYHora().getHour();
			return horaTurno < 12;
		}
		return false;
	}
}
