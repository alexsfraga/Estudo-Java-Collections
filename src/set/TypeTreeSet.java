package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TypeTreeSet {

	static TreeSet<String> fila1 = new TreeSet<>();
	
	public static void main(String[] args) {

		fila1.add("Mateus");
		fila1.add("Joao");
		fila1.add("Juliana");
		fila1.add("Ana Paula");
		fila1.add("Maria");
		
		System.out.println( fila1 );
		
		System.out.println( fila1.first() );
		System.out.println( fila1.last() );
		
		Iterator<String> it = fila1.iterator();
		while(it.hasNext()) {
			System.out.println( it.next() );
		}
		
		String name = fila1.pollFirst();
		System.out.println( name );
		System.out.println( fila1.pollLast() );
		System.out.println( fila1.first() );
		System.out.println( fila1 );
	}

}
