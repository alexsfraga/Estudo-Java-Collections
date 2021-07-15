package optional;

import java.util.Optional;

public class TypeOptional {

	static Optional<String> opVazio = Optional.empty();
	static Optional<String> opNull = Optional.ofNullable(null);
	static Optional<String> opString = Optional.of("teste");
	
	public static void main(String[] args) {
		
		System.out.println( "optional Vazio ->> \n" + "isempty = " + opVazio.isEmpty() );
		System.out.println( "isPresent = " + opVazio.isPresent() + "\n" );
		
		System.out.println( "optional Null ->> \n" + "isempty = " + opNull.isEmpty() );
		System.out.println( "isPresent = " + opNull.isPresent() + "\n" );
		
		System.out.println( "optional ComString ->> \n" + "isempty = " + opString.isEmpty() );
		System.out.println( "isPresent = " + opString.isPresent() );
		System.out.println( "valor = " + opString.get() );
		
		//lancara exception pelo fato de o objeto estar vazio e nao estar presente
		//System.out.println( "valor = " + opNull.get() );
		//evitando a exceptin por nullpointException
		opVazio.ifPresent(System.out::println);
		opVazio.ifPresentOrElse( System.out::println, ()->System.out.println( "opVazio esta vazio ") );
		
		opNull.ifPresent(System.out::println);
		opNull.ifPresentOrElse( System.out::println, ()->System.out.println( "opNull esta vazio ") );
		
		opString.ifPresent(System.out::println);
		
		//lancanco uma exception customizada
		String x = opString.orElseThrow( IllegalStateException::new);
		
		System.out.println( "valor de x = " + x );
		
	}

}
