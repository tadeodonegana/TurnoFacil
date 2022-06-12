package Filtros;

import Clases.Medico;
import Clases.ObraSocial;

public class FiltroObraSocial extends FiltroMedico{
	private ObraSocial obraSocial;
	
	public FiltroObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.trabajaConOS(obraSocial);
		return false;
	}
}
