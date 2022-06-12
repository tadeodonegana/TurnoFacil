package Filtros;

import Clases.Medico;

public class FiltroMedicoNOT extends FiltroMedico{
	private FiltroMedico f;
	
	public FiltroMedicoNOT(FiltroMedico f) {
		this.f = f;
	}

	public boolean cumple(Medico medico) {
		if (f != null)
			return !f.cumple(medico);
		return false;
	}
}
