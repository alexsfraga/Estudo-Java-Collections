package queue;
import java.util.LinkedList;
import java.util.Queue;

public class TypeQueue {

	static Queue<String> fila1 = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fila1.add("Mateus");
		fila1.add("Joao");
		fila1.add("Juliana");
		fila1.add("Ana Paula");
		fila1.add("Maria");

		System.out.println( fila1 );
		
		System.out.println( fila1.contains("Joao"));
		
		//retorna o elemento e o remove do inicio da fila 
		System.out.println( fila1.poll());
		
		//retorna e não remove do inicio da fila 
		System.out.println(fila1.peek());
		
		System.out.println( fila1 );
		
		
	}
	
	

}
