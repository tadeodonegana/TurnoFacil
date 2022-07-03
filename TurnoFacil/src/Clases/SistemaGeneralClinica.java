package Clases;

import java.util.ArrayList;
import Filtros.*;

public class SistemaGeneralClinica {
	//ATRIBUTOS
	private String nombre;
	private ArrayList<Secretaria> secretarias;
	
	//CONSTRUCTOR
	public SistemaGeneralClinica(String nombre) {
		this.nombre = nombre;
		this.secretarias = new ArrayList<Secretaria>();
	}
	
	//METODOS

	//Mediante este metodo es posible agregar una secretaria a la lista de secretarias del Sistema
	//General de la Clinica (siempre y cuando la secretaria no sea NULL )
	public void addSecretaria(Secretaria s) {
		if (s != null) {
			this.secretarias.add(s);
		}
	}
	
	//Mediante este metodo es posible obtener una lista de Pares MedicoTurnos que cumplan
	//con los filtros que se pasan por parametros (delegando responsabilidad a las secretarias)
	public ArrayList<ParMedicoTurnos> buscarParesMedicoTurnos(FiltroMedico fm, FiltroTurno ft) {
		ArrayList<ParMedicoTurnos> resultado_filtrado = new ArrayList<ParMedicoTurnos>();
		for (Secretaria secretaria: secretarias)
			resultado_filtrado.addAll(secretaria.buscarParesMedicoTurnos(fm, ft));
		return resultado_filtrado;
	}
}
