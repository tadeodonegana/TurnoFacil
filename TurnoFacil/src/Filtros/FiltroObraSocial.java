package Filtros;

import Clases.Medico;
import Clases.ObraSocial;

public class FiltroObraSocial extends FiltroMedico{
	private ObraSocial obraSocial;
	
	public FiltroObraSocial(String nombreOS) {
		this.obraSocial = new ObraSocial(nombreOS,0);
	}
	
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.trabajaConOS(obraSocial);
		return false;
	}
}
