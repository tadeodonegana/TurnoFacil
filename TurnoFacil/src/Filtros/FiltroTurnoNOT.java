package Filtros;

import Clases.Turno;

public class FiltroTurnoNOT extends FiltroTurno{
	private FiltroTurno f;
	
	public FiltroTurnoNOT(FiltroTurno f) {
		this.f = f;
	}

	public boolean cumple(Turno turno) {
		if (f != null)
			return !f.cumple(turno);
		return false;
	}
}
