package comparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {

	static List<Estado> estados = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Estado e1 = new Estado("Acre" , "AC");
		Estado e2 = new Estado("Alagoas" , "AL");
		Estado e3 = new Estado("Amapá" , "AP");
		Estado e4 = new Estado("Amazonas" , "AM");
		Estado e5 = new Estado("Bahia" , "BA");
		Estado e6 = new Estado("Ceará" , "CE");
		Estado e7 = new Estado("Espírito Santo" , "ES");
		Estado e8 = new Estado("Goiás" , "GO");
		Estado e9 = new Estado("Maranhão" , "MA");
		Estado e10 = new Estado("Mato Grosso" , "MT");
		Estado e11 = new Estado("Mato Grosso do Sul" , "MS");
		Estado e12 = new Estado("Minas Gerais" , "MG");
		Estado e13 = new Estado("Pará" , "PA");
		Estado e14 = new Estado("Paraíba" , "PB");
		Estado e15 = new Estado("Paraná" , "PR");
		Estado e16 = new Estado("Pernambuco" , "PE");
		Estado e17 = new Estado("Piauí" , "PI");
		Estado e18 = new Estado("Rio de Janeiro" , "RJ");
		Estado e19 = new Estado("Rio Grande do Norte" , "RN");
		Estado e20 = new Estado("Rio Grande do Sul" , "RS");
		Estado e21 = new Estado("Rondônia" , "RO");
		Estado e22 = new Estado("Roraima" , "RR");
		Estado e23 = new Estado("Santa Catarina" , "SC");
		Estado e24 = new Estado("São Paulo" , "SP");
		Estado e25 = new Estado("Sergipe" , "SE");
		Estado e26 = new Estado("Tocantins" , "TO");
		Estado e27 = new Estado("Distrito Federal" , "DF");

		estados.addAll( Arrays.asList(e3,e4,e26,e27,e5,e6,e7,e1,e2,e8,e9,e10,e11,e12,e15,e16,e17,e18,e13,e14,e19,e20,e21,e22,e23,e24,e25) );
		
		System.out.println( estados );
		
		//exemplos de como ordenar lista com a interface Collections, onde obrigatoriamente precisa implementar a classe comparable 
		Collections.sort(estados);
		//exemplo ordenacao da lista com a implementacao da interface comparable na classe dominio Estado
		estados.sort( (first, second)-> first.compareTo(second) );
		//exemplo de comparacao e ordenacao
		estados.sort( Comparator.comparing( Estado::getSigla) );
		
		//exemplo de ordenação reversa com string
		estados.sort(Comparator.reverseOrder());
		estados.sort( Comparator.comparing( Estado::getSigla).reversed() );
		Collections.sort(estados, new EstadoOrdemReversa() ); 
				
		System.out.println( estados );

	}

}
