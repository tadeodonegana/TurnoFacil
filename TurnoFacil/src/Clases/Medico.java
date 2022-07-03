package Clases;

import java.util.ArrayList;
import java.util.Objects;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	
	//Permite preguntarle al médico si trabaja con una Obra Social dada
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
	
	//Añade la jornada al médico sólo si esta puede serle asignada
	public void addJornada(JornadaDiaria jornada) {
		if (jornada != null && jornadaAsignable(jornada)) {
			this.jornadas.add(jornada);
		}
	}
	
	//Comprueba que la jornada dada no se superponga con jornadas que el médico ya posee
	private boolean jornadaAsignable(JornadaDiaria jornada) {
		int i = 0;
		while (i < jornadas.size()) {
			if (jornadas.get(i).seCruzaCon(jornada))
				return false;
			else
				i++;
		}
		return true;
	}
	
	//Permite preguntarle al médico si un turno puede serle asignado
	public boolean turnoAsignable(Turno turno) {
		int i = 0;
		int hora = turno.getFechaYHora().getHour();
		int minutos = turno.getFechaYHora().getMinute();
		LocalTime horario = LocalTime.of(hora, minutos);
		while (i < jornadas.size()) {
			JornadaDiaria jornada = jornadas.get(i);
			//Corrobora inicioJornada <= horario <= finJornada y si el día del horario coincide con el día de la jornada
			if ((jornada.getHoraInicio().isBefore(horario) || jornada.getHoraInicio().equals(horario)) && (jornada.getHoraFin().isAfter(horario.plusMinutes(turno.getDuracion())) || jornada.getHoraFin().equals(horario.plusMinutes(turno.getDuracion()))) && turno.getFechaYHora().getDayOfWeek().getValue() == jornada.getDiaDeSemana())
				return true;
			else
				i++;
		}
		return false;
	}
	
	//Añade la obra social dada sólo si no la tenía
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