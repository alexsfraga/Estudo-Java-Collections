package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TypeLinkedHashSet {

	static LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(); 
	
	public static void main(String[] args) {

		//adicionando itens ao linkedHashSet
		linkedSet.add(3);
		linkedSet.add(88);
		linkedSet.add(20);
		linkedSet.add(44);
		linkedSet.add(3);
		
		//exibindo a list 
		System.out.println( linkedSet );
		
	
		//percorrendo list com iterator
		Iterator<Integer> it = linkedSet.iterator(); 
		while(it.hasNext()) {
			System.out.println( it.next() );
		}
		
		//adicionando um novo numero 
		linkedSet.add(23);
		System.out.println( linkedSet );
		
		
		// verificando o tamanho
		System.out.println( "tamanho = " + linkedSet.size() );
		
		//limpando o linkedhashset
		linkedSet.clear();
		
		//verificando se esta vazio
		System.out.println( "a lista esta vazia ? = " + linkedSet.isEmpty() );

		
		
	}

}
