package Clases;

import java.util.ArrayList;

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
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Apellido: " + apellido + " - Especialidad: " + especialidad;
	}

}
