package Clases;

import java.util.ArrayList;
import java.util.Objects;

public class Medico {
	private String nombre, apellido, especialidad, usuario, clave;
	private int DNI;
	private ArrayList<ObraSocial> obrasSociales;
	private ArrayList<JornadaDiaria> jornadas;
	
	public Medico(String nombre, String apellido, String especialidad, String usuario, String clave, int DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.usuario = usuario;
		this.DNI = DNI;
		this.obrasSociales = new ArrayList<ObraSocial>();
		this.jornadas = new ArrayList<JornadaDiaria>();
	}
	
	public boolean trabajaConOS(ObraSocial os) {
		return obrasSociales.contains(os);
	}
	
	public String getNombreYApellido() {
		return nombre + " " + apellido;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public ArrayList<JornadaDiaria> getJornadas(){
		return new ArrayList<JornadaDiaria>(jornadas);
	}
	
	public void addJornada(JornadaDiaria j) {
		if (j != null) {
			this.jornadas.add(j);
		}
	}
	
	public void addOS(ObraSocial os) {
		if (os != null && ! this.obrasSociales.contains(os)) {
			this.obrasSociales.add(os);
		}		
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Apellido: " + apellido + " - Especialidad: " + especialidad;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return DNI == other.DNI;
	}
}