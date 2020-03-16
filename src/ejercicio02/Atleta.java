package ejercicio02;

public class Atleta {

	private String especialidad;
	private String id;
	private double tiempo;

	//Constructor por defecto
	public Atleta() {

		this.especialidad = "Sin especialidad";
		this.id = "Sin Id";
		this.tiempo = 0;
	}

	//Constructor parametrizado
	public Atleta(String id, String especialidad) {
		this.especialidad = especialidad;
		this.id = id;
		this.tiempo = 0;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo2) {
		this.tiempo = tiempo2;
	}

	@Override
	public String toString() {
		return "[Atleta: " + this.id + ", Especialidad: " + 
	           this.especialidad + ", Tiempo: " + this.tiempo + "]";
	}
	
	
	
}
