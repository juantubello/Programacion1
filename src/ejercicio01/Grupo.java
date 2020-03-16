package ejercicio01;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes = new ArrayList<String>();

	public Grupo() {

	}

	public Grupo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIntegrantes() {
		return this.integrantes.size();
	}

	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}

	public void agregarIntegrante(String nombreIntegrante) {

		int indice = obtenerPosicionIntegrante(nombreIntegrante);

		if (indice == -1) {
			this.integrantes.add(nombreIntegrante);
		}
	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {

		int indice = 0;
		boolean estaEnLaLista = false;

		while (indice < this.integrantes.size() && estaEnLaLista == false) {

			if (this.integrantes.get(indice).equals(nombreIntegrante)) {
				estaEnLaLista = true;
			} else {
				indice++;
			}
		}
		if (estaEnLaLista) {
			return indice;
		} else {
			return -1;
		}
	}

	public String obtenerIntegrante(int posicion) {

		if (posicion >= 1) {
			return this.integrantes.get(posicion - 1);
		} else {
			return null;
		}
	}

	public String buscarIntegrante(String nombreIntegrante) {

		int indice = obtenerPosicionIntegrante(nombreIntegrante);

		if (indice != -1) {
			return this.integrantes.get(indice);
		} else {
			return null;
		}
	}
	
	public String removerIntegrante(String nombreIntegrante){
		
		int indice = obtenerPosicionIntegrante(nombreIntegrante);
		String nombreEliminado;
		
		if (indice != -1) {
			nombreEliminado = this.integrantes.get(indice);
			this.integrantes.remove(indice);
			return nombreEliminado;
		} else {
			return null;
		}
	}
	
	private void mostrarIntegrantes(){
		
		String salida;
		String integrantes = "";
		
		salida = "Cantidad de integrantes: " + this.integrantes.size() + "Nombres: \n";

		
		for(String nombre: this.integrantes){
			integrantes += nombre + " ";
		}
		
		System.out.println(salida + integrantes);
	}
	
	public void mostrar(){
		
		mostrarIntegrantes();
		
	}
	
	public void vaciar(){
		
		integrantes.clear();
		
	}

	@Override
	public String toString() {
		return "Grupo: " + nombre + ", integrantes:" + integrantes;
	}
	
	
}
