package Clases;

import java.time.LocalDateTime;

public class JornadaDiaria {
	
	public String diaDeSemana;
	public LocalDateTime horaInicio;
	public LocalDateTime horaFin;
	
	public JornadaDiaria(String diaDeSemana, LocalDateTime horaInicio, LocalDateTime horaFin) {
		super();
		this.diaDeSemana = diaDeSemana;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public String getDiaDeSemana() {
		return diaDeSemana;
	}

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public LocalDateTime getHoraFin() {
		return horaFin;
	}

	@Override
	public String toString() {
		return "Dia De la Semana = " + diaDeSemana + ", Hora de Inicio = " + horaInicio.toString() + ", Hora de Fin = " + horaFin.toString();
	}

}
