package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TypeSet {

	static Set<Integer> setList = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 88 20 44 3
		setList.add(3);
		setList.add(88);
		setList.add(20);
		setList.add(44);
		setList.add(3);
		

		System.out.println( setList.toString() ) ;
		
		setList.remove(3);
		System.out.println("\n");
		
		Iterator<Integer> it = setList.iterator();
		while(it.hasNext()) {
			System.out.println( it.next() );
		}
	
		System.out.println("Lista esta vazia :"  + setList.isEmpty() + " - e o tamanho é = " + setList.size());
		
			setList.clear();
				
		System.out.println("Lista esta vazia :"  + setList.isEmpty() + " - e o tamanho é = " + setList.size());
	}

}
