package Filtros;

import Clases.Turno;

public class FiltroTurnoOR extends FiltroTurno{
	private FiltroTurno f1,f2;
	
	public FiltroTurnoOR(FiltroTurno f1, FiltroTurno f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Turno turno) {
		boolean salida = false;
		if (f1 != null)
			salida = f1.cumple(turno);
		if (f2 != null)
			salida = salida || f2.cumple(turno);
		return salida;
	}

}
