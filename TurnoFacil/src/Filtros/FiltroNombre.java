package Filtros;

import Clases.Medico;

public class FiltroNombre extends FiltroMedico{
	private String nombre;
	
	public FiltroNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean cumple(Medico medico) {
		if (medico != null)
			return medico.getNombre().equals(nombre);
		return false;
	}
}
