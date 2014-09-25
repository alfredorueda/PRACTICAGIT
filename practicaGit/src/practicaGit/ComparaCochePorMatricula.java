package practicaGit;

import java.util.Comparator;

public class ComparaCochePorMatricula implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		
		return o1.getMatricula().compareTo(o2.getMatricula());
	}

}
