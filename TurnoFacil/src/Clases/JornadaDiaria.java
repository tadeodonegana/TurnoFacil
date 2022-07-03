package Clases;

import java.time.LocalTime;

public class JornadaDiaria {
	
	public String diaDeSemana;
	public LocalTime horaInicio;
	public LocalTime horaFin;
	
	public JornadaDiaria(String diaDeSemana, LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.diaDeSemana = diaDeSemana;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public String getDiaDeSemana() {
		return diaDeSemana;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	@Override
	public String toString() {
		return "Dia De la Semana = " + diaDeSemana + ", Hora de Inicio = " + horaInicio.toString() + ", Hora de Fin = " + horaFin.toString();
	}

}
