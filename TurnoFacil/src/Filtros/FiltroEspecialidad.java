package Filtros;

import Clases.Medico;

public class FiltroEspecialidad extends FiltroMedico{
	private String especialidad;
	
	public FiltroEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.getEspecialidad().equals(especialidad);
		return false;
	}
}
