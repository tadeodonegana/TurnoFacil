package Clases;

import java.util.ArrayList;
import Filtros.*;

public class SistemaGeneralClinica {
	private String nombre;
	private ArrayList<Secretaria> secretarias;
	
	public SistemaGeneralClinica(String nombre) {
		this.nombre = nombre;
		this.secretarias = new ArrayList<Secretaria>();
	}
	
	public void addSecretaria(Secretaria s) {
		if (s != null) {
			this.secretarias.add(s);
		}
	}
	
	public ArrayList<ParMedicoTurnos> buscarParesMedicoTurnos(FiltroMedico fm, FiltroTurno ft) {
		ArrayList<ParMedicoTurnos> resultado_filtrado = new ArrayList<ParMedicoTurnos>();
		for (Secretaria secretaria: secretarias)
			resultado_filtrado.addAll(secretaria.buscarParesMedicoTurnos(fm, ft));
		return resultado_filtrado;
	}
}
