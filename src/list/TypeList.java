package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TypeList {

	static List<String> fila1 = new ArrayList<>();
	
	public static void main(String[] args) {

		fila1.add("Mateus");
		fila1.add("Joao");
		fila1.add("Juliana");
		fila1.add("Ana Paula");
		fila1.add("Maria");
		fila1.add("Carla");
		
		System.out.println( fila1.get(0) );
		
		System.out.println( fila1 );
		//ordenando de forma simploria por nome
		Collections.sort( fila1 );
		System.out.println( fila1 );
		
		//atualizando um elemento
		fila1.set(2, "Carolina");
		System.out.println( fila1 );
		
		//removendo um elemento
		fila1.remove(1);
		fila1.remove("Maria");
		System.out.println( fila1 );
		
		int pj = fila1.indexOf("Juliana");
		System.out.println( "posicao de Juliana = " + pj);
		
		//posicao de maria = a -1 pelo fato de maria nao exixtir na lista
		System.out.println( "posicao de Maria = " + fila1.indexOf("Maria"));
		
		System.out.println( "fila esta vazia ? = " + fila1.isEmpty() );
		
		Iterator<String> it = fila1.iterator();
		while(it.hasNext()) {
			System.out.println( "-->" + it.next() );
		}
		
		//removendo todos os elementos da lista
		fila1.clear();
		System.out.println( fila1 );
	}

}
