package Filtros;

import Clases.Medico;
import Clases.ObraSocial;

public class FiltroObraSocial extends FiltroMedico{
	private ObraSocial obraSocial;
	
	public FiltroObraSocial(String nombreOS) {
		this.obraSocial = new ObraSocial(nombreOS,0);
	}
	//Mediante el siguiente metodo se controla si un medico 
	//trabaja o no con cierta obra social (atributo)
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.trabajaConOS(obraSocial);
		return false;
	}
}
