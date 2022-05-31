import prueba.Medico;

public class BusquedaNombre extends CriterioMedico{

	public BusquedaNombre() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean cumple(Object obj) {
		Medico medico = (Medico) obj;
		return med.getNombre().equals(medico.getNombre()) && med.getApellido().equals(medico.getApellido());
	}
}
