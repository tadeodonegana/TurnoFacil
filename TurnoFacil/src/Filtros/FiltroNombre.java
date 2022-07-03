package Filtros;

import Clases.Medico;

public class FiltroNombre extends FiltroMedico{
	private String nombreYApellido;
	
	public FiltroNombre(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public boolean cumple(Medico medico) {// este filtro sirve para comparar el nombre y apellido del medico 
		if (medico != null)
			return medico.getNombreYApellido().equals(nombreYApellido);
		return false;
	}
}
