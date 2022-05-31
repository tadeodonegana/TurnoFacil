
public class Medico {
	
	private String nombre, apellido, especialidad;
	private int DNI;

	public Medico(String nombre, String apellido, String especialidad, int DNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.password = password;
		this.DNI = DNI;
	}
	
	// Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public int getDNI() {
		return DNI;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " / Apellido: " + this.apellido + " / Especialidad: "+ this.especialidad + " / DNI: " + DNI;
	}
}
