package practicaGit;

import java.util.Comparator;

public class ComparaCochePorCaballos implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {

		return o1.getCaballos() - o2.getCaballos();
	}

}
