package comparators;

import java.util.Comparator;

public class EstadoOrdemReversa implements Comparator<Estado>{

	@Override
	public int compare(Estado e1, Estado e2) {
		return e2.getSigla().toUpperCase().compareTo(e1.getSigla().toUpperCase());
	}

}
