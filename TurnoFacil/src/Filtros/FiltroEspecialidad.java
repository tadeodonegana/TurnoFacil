package Filtros;

import Clases.Medico;

//Este filtro sirve para filtrar los m dicos por su especialidad
public class FiltroEspecialidad extends FiltroMedico{
	private String especialidad;
	
	public FiltroEspecialidad(String especialidad) {
		this.especialidad = especialidad; //es la especialidad buscada
	}
	
	//Dado un m dico comprueba si su especialidad es o no igual a la buscada
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.getEspecialidad().equals(especialidad);
		return false;
	}
}
