package Clases;

import java.time.LocalTime;

public class JornadaDiaria {
	
	private int diaDeSemana;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	public JornadaDiaria(int diaDeSemana, LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.diaDeSemana = diaDeSemana;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getDiaDeSemana() {
		return diaDeSemana;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}
	
	public boolean seCruzaCon(JornadaDiaria j) { //verifica que dos jornadas no se solapen
		return ((this.diaDeSemana == j.getDiaDeSemana()) && !((this.horaInicio.isAfter(j.getHoraFin()) || this.horaInicio.equals(j.getHoraFin())) || (this.horaFin.isBefore(j.getHoraInicio()) || this.horaFin.equals(j.getHoraInicio()))));
	}
	
	private String diaDeSemana(int dia) {//Devuelve de acuerdo al nro que se pasa por parametro(1-7), el dia de la semana que le corresponde
		switch(dia) {
			case 1: return "Lunes";
			case 2: return "Martes";
			case 3: return "Miercoles";
			case 4: return "Jueves";
			case 5: return "Viernes";
			case 6: return "Sabado";
			case 7: return "Domingo";
		}
		return " ";
	}

	@Override
	public String toString() {//String de los datos de la jornada
		return "Dia De la Semana = " + this.diaDeSemana(diaDeSemana) + ", Hora de Inicio = " + horaInicio.toString() + ", Hora de Fin = " + horaFin.toString();
	}

}
