package Filtros;

import java.time.LocalDateTime;

import Clases.Turno;

public class FiltroRangoFechas extends FiltroTurno{
	private LocalDateTime fechaMin,fechMax;

	public FiltroRangoFechas(LocalDateTime fechaMin,LocalDateTime fechaMax) {
		this.fechaMin = fechaMin;
		this.fechMax = fechaMax;
	}
	
	public LocalDateTime getFechaMax() { //ya que hay un m todo en el que es necesario preguntar por la fecha m xima de un filtro por rango de fechas
		return fechMax;
	}
	
	public boolean cumple(Turno turno) { //para determinar si un turno cumple con el rango de fechas del filtrado
		if (turno != null) {
			int comparacionConMin = turno.getFechaYHora().compareTo(fechaMin);
			int comparacionConMax = turno.getFechaYHora().compareTo(fechMax);
			if ((comparacionConMin >= 0) && (comparacionConMax <= 0)) //si la fecha del turno se encuentra en el rango se retorna true
				return true;
		}
		return false;
	}
	
}
