package Filtros;

import java.time.LocalDateTime;

import Clases.Turno;

public class FiltroFechaMayor extends FiltroTurno{
	private LocalDateTime fechaMin;
	
	public FiltroFechaMayor(LocalDateTime fechaMin) {
		this.fechaMin = fechaMin;
	}
	
	public boolean cumple(Turno turno) {
		if (turno != null)
			if (turno.getFechaYHora().compareTo(fechaMin) > 0)
				return true;
		return false;
	}

}
