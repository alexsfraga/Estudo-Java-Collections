package map;
import java.util.Map;
import java.util.TreeMap;

public class TypeTreeMap {

	static TreeMap<String, Integer> selecoes = new TreeMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		selecoes.put("brasil",  5);
		selecoes.put("alemanha", 4);
		selecoes.put("italia", 4);
		selecoes.put("uruguai", 2);
		selecoes.put("argentina", 2);
		selecoes.put("franca", 2);
		selecoes.put("inglaterra", 1);
		selecoes.put("espanha", 1);
		
		//retorna a primeira chave do map
		System.out.println( selecoes.firstKey() );
		//retorna a ultima chave do map
		System.out.println( selecoes.lastKey() );
		
		System.out.println( selecoes.higherKey("alemanha") );
		System.out.println( selecoes.lowerKey("argentina") );
		
		//retirna todos os registros do MAP
		System.out.println( selecoes );
		
		//retorna o valor do primeiro registro
		System.out.println( selecoes.firstEntry().getKey() + " ------- " + selecoes.firstEntry().getValue() );
		
		//retorna o valor do ultimo registro no map
		System.out.println( selecoes.lastEntry().getKey() + " ------- " + selecoes.lastEntry().getValue() );
		
		//navegar nos registros do MAP
		for( Map.Entry<String, Integer> entry : selecoes.entrySet() ) {
			System.out.println( entry.getKey()  + "----" + entry.getValue() );
		}
		
		//retorna o valor do primeiro registro e remove do map
		Map.Entry<String, Integer> firstEntry = selecoes.pollFirstEntry();
		System.out.println( firstEntry.getKey() + " ------- " + firstEntry.getValue() );
		
		//retorna o valor do ultimo registro no map e remove do map
		Map.Entry<String, Integer> lastEntry = selecoes.pollFirstEntry();
		System.out.println( lastEntry.getKey() + " ------- " + lastEntry.getValue() );

		//retirna todos os registros do MAP
		System.out.println( selecoes );

		//navegar no mapa
		for(String key : selecoes.keySet() ) {
			System.out.println( key + " ----- " + selecoes.get(key) );
		}
		
	}

}
