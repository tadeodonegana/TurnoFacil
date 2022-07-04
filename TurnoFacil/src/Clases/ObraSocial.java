package Clases;

import java.util.ArrayList;

public class ObraSocial {
	private String nombre;
	private double monto_cubre;
	private ArrayList<Paciente> pacientes;
	
	public ObraSocial(String nombre, double monto_cubre) {
		this.nombre = nombre;
		this.monto_cubre = monto_cubre;
		this.pacientes = new ArrayList<Paciente>();
	}
	
	public String getNombre() { 
		return nombre;
	}
	
	public double getMontoCubre() {
		return monto_cubre;
	}
	
	@Override
	public boolean equals(Object obj) { //Verifica que dos ObraSociales sean iguales a partir de su nombre
		try {
			ObraSocial o = (ObraSocial) obj;
			return (this.nombre.equals(o.getNombre()));
		}
		catch(Exception e) {
			return false;
		}
	}

}