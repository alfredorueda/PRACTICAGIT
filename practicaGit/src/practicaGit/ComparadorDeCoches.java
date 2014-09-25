package practicaGit;

import java.util.ArrayList;
import java.util.Collections;

public class ComparadorDeCoches {

	//First Commit Alfredo
	//Warren también la va a liar.
	
	public static void main(String[] args) {
		
		Coche c1 = new Coche("B-4590-GNN", 1990, 1600, 90, "Seat", "Ibiza", "John Doe");
		Coche c2 = new Coche("B-4587-GNN", 2000, 4000, 200, "Ferrari	", "F40", "Jane Doe");
		Coche c3 = new Coche("B-4200-GNN", 2010, 1700, 110, "Wolskwagen", "Polo", "Junior Doe");
		Coche c4 = new Coche("B-4300-GNN", 1998, 2000, 93, "Seat", "Ibiza", "Uncle Doe");
		
		
		ArrayList<Coche> listCoche = new ArrayList<Coche>();
		
		listCoche.add(c1);
		listCoche.add(c2);
		listCoche.add(c3);
		listCoche.add(c4);
		
		System.out.println("Vamos a mostrar la lista de coche desordenada: ");
		Collections.shuffle(listCoche);
		System.out.println(listCoche);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Vamos a ordenar la lista por matricula:");
		Collections.sort(listCoche, new ComparaCochePorMatricula());
		System.out.println(listCoche);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Vamos a ordenar la lista por cilindrada");
		Collections.sort(listCoche, new ComparaCochePorCilindrada());
		System.out.println(listCoche);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Vamos a ordenar la lista por caballos:");
		Collections.sort(listCoche, new ComparaCochePorCaballos());
		System.out.println(listCoche);
		System.out.println("");
		System.out.println("");
		
		System.out.println("Vamos a ordenar la lista por propietario:");
		Collections.sort(listCoche, new ComparaCochePorPropietario());
		System.out.println(listCoche);
		System.out.println("");
		System.out.println("");
	}

}
