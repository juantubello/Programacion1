package ejercicio02;

import java.util.Scanner;
import java.util.ArrayList;

public class Main002 {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Atleta> atletas = new ArrayList<Atleta>();
	static ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
	
	public static void main(String[] args) {
		
		//Creo ateltas
		
		Atleta atleta01 = new Atleta("00001", "Velocidad");
		Atleta atleta02 = new Atleta("00002", "Velocidad");
		Atleta atleta03 = new Atleta("00003", "Velocidad");

		ingresarAtleta(atleta01, 4.5);
		ingresarAtleta(atleta02, 5);
		ingresarAtleta(atleta03, 4.5);
		
		ganadores = obtenerGanador(atletas);
		System.out.println("Ganadores: " + ganadores);
	}

	public static ArrayList<Atleta> obtenerGanador(ArrayList<Atleta> atletas) {
		
		System.out.println(atletas.size());
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();

		for (int i = 0; i < atletas.size(); i++) {

			if (ganadores.size() <= 0) {
				ganadores.add(atletas.get(i));

			} else {

				if (atletas.get(i).getTiempo() < ganadores.get(0).getTiempo()) {
					ganadores.clear();
					ganadores.add(atletas.get(i));
					
				} else if (atletas.get(i).getTiempo() == ganadores.get(0).getTiempo()) {
					ganadores.add(atletas.get(i));
				}
			}
		}

		return ganadores;

	}

	// Funcion para agregar atletas y tiempo
	public static void ingresarAtleta(Atleta atleta, double tiempo){
		atleta.setTiempo(tiempo);
		atletas.add(atleta);
	}
	
}
