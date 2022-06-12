package Filtros;

import Clases.Medico;

public class FiltroMedicoAND extends FiltroMedico{
	private FiltroMedico f1,f2;

	public FiltroMedicoAND(FiltroMedico f1, FiltroMedico f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public boolean cumple(Medico medico) {
		if (f1 != null && f2 != null)
			return f1.cumple(medico) && f2.cumple(medico);
		return false;
	}
}
