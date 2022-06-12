package Filtros;

import Clases.Medico;

public class FiltroMedicoOR extends FiltroMedico{
	private FiltroMedico f1,f2;
	
	public FiltroMedicoOR(FiltroMedico f1, FiltroMedico f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Medico medico) {
		boolean salida = false;
		if (f1 != null)
			salida = f1.cumple(medico);
		if (f2 != null)
			salida = salida || f2.cumple(medico);
		return salida;
	}

}
