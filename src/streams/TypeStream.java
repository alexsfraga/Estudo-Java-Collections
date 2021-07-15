package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TypeStream {

	static List<String> pessoas = new ArrayList<>();
	
	public static void main(String[] args) {

		pessoas.add("Mateus");
		pessoas.add("Joao");
		pessoas.add("Juliana");
		pessoas.add("Ana Paula");
		pessoas.add("Maria");

		//retorna a contagem de elementos do stream
		System.out.println( "quantidade de elementos no stream = " + pessoas.stream().count() );
		
		//retorna o elemento com o maior numero de letras
		System.out.println("Pessoa com maior numero de letras = " +  pessoas.stream().max(Comparator.comparingInt(String::length)) );
		
		//retorna o elemento com o menor numero de letras
		System.out.println("Pessoa com menor numero de letras = " +  pessoas.stream().min(Comparator.comparingInt(String::length)) );
		
		//retorna o elemento com a letra R
		System.out.println("Pessoa com a letra R no nome = " + 
			pessoas.stream().filter(
					(pessoa)-> pessoa.toLowerCase().contains("r"))
						.collect(Collectors.toList())
		);
		
		//retorna nomes concatenados com o total de letras de cada nome
		System.out.println( "Pessoa + qtd Letras = " +
				pessoas.stream().map(
						pessoa -> pessoa.concat("-").concat(String.valueOf( pessoa.length() ))
					).collect( Collectors.toList() )
		);
		
		//retorna os 3 primeiros elementos da coleção
		System.out.println(
				"3 primeiros elementos = " + pessoas.stream().limit(3).collect(Collectors.toList())
		);
		
		//Exibe cada elemento no console e depois retorna a mesma coleção
		System.out.println(
				"Retorna os elementos =" + pessoas.stream().peek(System.out::println).collect(Collectors.toList())
		);
		
		//exibe cada elemento e retorna outra colecao
		System.out.println("Retorna os elementos e outra colecao" ); 
		pessoas.stream().forEach(System.out::println);
		
		//retorna true se todos os elementos contiverem a letra buscada EXEMPLO: A
		String xc = "a";
		System.out.println(	"Todos possuem a letra " + xc.toUpperCase()  + " = " +
				pessoas.stream().allMatch((pessoa)->pessoa.contains(xc))
		);
		
		//retorna true se um dos elementos contiver a letra buscada EXEMPLO: j
		String xc2 = "j";
		System.out.println(	"Algum elemento contem a letra " + xc2.toUpperCase()  + " = " +
				pessoas.stream().anyMatch((pessoa)->pessoa.toLowerCase().contains(xc2))
		);
		
		//retorna true se nenhum dos elementos contiver a letra buscada EXEMPLO: w
		String xc3 = "w";
		System.out.println(	"Nenhum elemento contem a letra " + xc3.toUpperCase()  + " = " +
				pessoas.stream().noneMatch((pessoa)->pessoa.toLowerCase().contains(xc3))
		);
		
		//retorna o primeiro elemento da coleção
		System.out.println("O primeiro elemento é = ");
		pessoas.stream().findFirst().ifPresent(System.out::println);
		
	}

}
