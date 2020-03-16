package ejercicio01;

public class Main {

	public static void main(String[] args) {

		Grupo grupo = new Grupo("Grupo 2");

		// Agrego integrantes reales
		grupo.agregarIntegrante("Tomi");
		grupo.agregarIntegrante("Juan");
		grupo.agregarIntegrante("Mariano");
		grupo.agregarIntegrante("Fede");

		// Agrego integrante ficticio
		agregarIntegrante(grupo, "marcelo");

		// Valido si un integrante esta o no en el grupo
		estaEnElGrupo(grupo, "marcelo");
		estaEnElGrupo(grupo, "Pepe");

		// Muestro los datos del grupo
		System.out.println(grupo);

		// Removemos integrante ficticio
		String test = grupo.removerIntegrante("marcelo");
		System.out.println(test);

		// Volvemos a remover al mismo integrante
		grupo.removerIntegrante("marcelo");

		// Muestro los datos del grupo
		System.out.println(grupo);

		// Remuevo a todos los integrantes
		grupo.vaciar();

		// Muestro los datos del grupo
		System.out.println(grupo);
	}

	static public void agregarIntegrante(Grupo grupo, String nombre) {

		grupo.agregarIntegrante(nombre);
		System.out.println(nombre + "  fue asignado al grupo " + grupo.getNombre());

	}

	static public void estaEnElGrupo(Grupo grupo, String nombre) {

		String integrante;

		integrante = grupo.buscarIntegrante(nombre);

		if (integrante != null) {
			System.out.println(nombre + " esta en el " + grupo.getNombre());
		} else {
			System.out.println(nombre + " no esta en " + grupo.getNombre());
		}
	}
}
