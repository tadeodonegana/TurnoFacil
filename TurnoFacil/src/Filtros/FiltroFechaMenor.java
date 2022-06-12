package Filtros;

import java.time.LocalDateTime;

import Clases.Turno;

public class FiltroFechaMenor extends FiltroTurno{
	private LocalDateTime fechaMax;
	
	public FiltroFechaMenor(LocalDateTime fechaMax) {
		this.fechaMax = fechaMax;
	}
	
	public boolean cumple(Turno turno) {
		if (turno != null)
			if (turno.getFechaYHora().compareTo(fechaMax) < 0)
				return true;
		return false;
	}
	
}
