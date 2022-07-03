package Filtros;

import java.time.LocalDateTime;

import Clases.Turno;

public class FiltroRangoFechas extends FiltroTurno{
	private LocalDateTime fechaMin,fechMax;

	public FiltroRangoFechas(LocalDateTime fechaMin,LocalDateTime fechaMax) {
		this.fechaMin = fechaMin;
		this.fechMax = fechaMax;
	}
	
	public boolean cumple(Turno turno) {
		if (turno != null) {
			int comparacionConMin = turno.getFechaYHora().compareTo(fechaMin);
			int comparacionConMax = turno.getFechaYHora().compareTo(fechMax);
			if ((comparacionConMin >= 0) && (comparacionConMax <= 0))
				return true;
		}
		return false;
	}
	
}
