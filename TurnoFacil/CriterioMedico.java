
public abstract class CriterioMedico extends CriterioBusqueda{

	protected Medico med;
	
	public CriterioMedico(Medico med) {
		this.med = med;
	}
	
	public abstract boolean cumple(Object medico);

}
