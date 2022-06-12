package Filtros;

import Clases.Turno;

public class FiltroTurnoAND extends FiltroTurno{
	private FiltroTurno f1,f2;
	
	public FiltroTurnoAND(FiltroTurno f1, FiltroTurno f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Turno turno) {
		if (f1 != null && f2 != null)
			return f1.cumple(turno) && f2.cumple(turno);
		return false;
	}

}
