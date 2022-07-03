package Clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Turno {
	private LocalDateTime fecha;
	private Medico medico;
	private Paciente paciente;
	private double costo;
	private int duracion;
	
	public Turno(LocalDateTime fecha, Medico medico, double costo, int duracion) {
		assert(medico != null);
		this.fecha = fecha;
		this.medico = medico;
		this.paciente = null;
		this.costo = costo;
		this.duracion = duracion;
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
	
	public int getDuracion() {
		return duracion;
	}
	
	public boolean seCruzaCon(Turno t) {//este método sirve para identificar si un turno se cruza con otro, observando si el dia,mes y anio es el mismo, ademas de ver si la hora de inicio del turno no se encuentra en el lapso de ejecucion de otro turno
		LocalTime horario_1 = LocalTime.of(fecha.getHour(), fecha.getMinute());
		LocalTime horario_2 = LocalTime.of(t.getFechaYHora().getHour(), t.getFechaYHora().getMinute());
		return (this.fecha.getDayOfMonth() == t.getFechaYHora().getDayOfMonth() && this.fecha.getMonthValue() == t.getFechaYHora().getMonthValue() && this.fecha.getYear() == t.getFechaYHora().getYear() && !(((horario_1.isAfter(horario_2.plusMinutes(t.getDuracion()))) || horario_1.equals(horario_2.plusMinutes(t.getDuracion()))) || (horario_1.plusMinutes(duracion).isBefore(horario_2) || horario_1.plusMinutes(duracion).equals(horario_2))));
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
		return "Fecha y Hora= " + fecha + ", Medico= " + medico + ", Costo= " + costo + ", Duracion= " + duracion;
	}
	
}
