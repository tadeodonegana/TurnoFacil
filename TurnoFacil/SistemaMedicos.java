
import java.util.ArrayList;

import prueba.CriterioMedico;
import prueba.Medico;

public class SistemaMedicos {
	
	private ArrayList<Medico> medicos;

	public SistemaMedicos() {
		medicos = new ArrayList<Medico>();
	}
	
	public void addMedicos(Medico med) {
		if (med != null) {
			medicos.add(med);
		}
	}
	
	public ArrayList<Medico> buscarMedicos(CriterioMedico c) {
		ArrayList<Medico> salida = new ArrayList<>();
		for (int i=0; i<medicos.size(); i++) {
			if (c.cumple(medicos.get(i))) {
				salida.add(medicos.get(i));
			}
		}
		return salida;
	}
	
	public String listarMedicos (CriterioMedico c) {
		ArrayList<Medico> Impresion = buscarMedicos(c);
		String salida = "Medicos: " + "\n";
		for(int i=0; i<Impresion.size(); i++) {
			salida = salida + Impresion.get(i).toString() + "\n";
		}
		return salida;
	}
}
