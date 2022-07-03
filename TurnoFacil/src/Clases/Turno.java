package Clases;

import java.time.LocalDateTime;

public class Turno {
	private LocalDateTime fecha;
	private Medico medico;
	private Paciente paciente;
	private double costo;
	
	public Turno(LocalDateTime fecha, Medico medico, double costo) {
		assert(medico != null);
		this.fecha = fecha;
		this.medico = medico;
		this.paciente = null;
		this.costo = costo;
	}
	
	public LocalDateTime getFechaYHora() {
		return fecha;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public Medico getMedico() {
		return medico;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Turno t = (Turno) obj;
			return (this.fecha == t.getFechaYHora());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Fecha y Hora= " + fecha + ", Medico= " + medico + ", Costo= " + costo;
	}
	
}
