package Filtros;

import Clases.Turno;

//De esta clase heredar n todos los filtros relacionados a los turnos
public abstract class FiltroTurno {
	
	public abstract boolean cumple(Turno turno);
	
}
