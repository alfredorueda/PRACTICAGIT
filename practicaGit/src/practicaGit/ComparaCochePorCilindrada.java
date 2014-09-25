package practicaGit;

import java.util.Comparator;

public class ComparaCochePorCilindrada implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {

		return o1.getCilindrada() - o2.getCilindrada();
	}

}
