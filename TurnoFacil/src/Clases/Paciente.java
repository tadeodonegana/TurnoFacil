package Clases;

import java.util.ArrayList;

public class Paciente {
	private String nombre, apellido, direccion, telefono, email;
	private int DNI, numAfiliado;
	private ObraSocial obraSocial;
	private ArrayList<Turno> turnos;
	
	public Paciente(String nombre, String apellido, String direccion, String telefono, String email, int DNI, int numAfiliado, ObraSocial obraSocial) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.DNI = DNI;
		this.numAfiliado = numAfiliado;
		this.obraSocial = obraSocial;
		this.turnos = new ArrayList<Turno>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public int getDNI() {
		return DNI;
	}

	public int getNumAfiliado() {
		return numAfiliado;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}
	
	public void addTurno(Turno turno) {
		turnos.add(turno);
	}
}
