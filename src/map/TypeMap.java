package map;
import java.util.HashMap;
import java.util.Map;

public class TypeMap {
	
	static Map<String, Integer> selecoes = new HashMap<>();

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
		
		selecoes.put("brasil", 6);
		
		System.out.println( selecoes.get("brasil") );
		
		//metodo cotainsKey verifica se existe e retorna TRUE or FALSE
		System.out.println( selecoes.containsKey("franca") );
		System.out.println( selecoes.containsKey("mexico") );
		
		//retorna TRUE or FALSE caso o Valor procurado exista ou não
		System.out.println( selecoes.containsValue(6) );
		
		//retorna o tamanho do MAP
		System.out.println( selecoes.size() );
		
		//remover um elemento do mapa
		System.out.println( selecoes.remove("franca") );
		System.out.println( selecoes.containsKey("franca") );
		System.out.println( selecoes.remove("franca") );
		
		//navegar nos registros do MAP
		for( Map.Entry<String, Integer> entry : selecoes.entrySet() ) {
			System.out.println( entry.getKey()  + "----" + entry.getValue() );
		}
		//navegar no mapa
		for(String key : selecoes.keySet() ) {
			System.out.println( key + " ----- " + selecoes.get(key) );
		}
		
		//limpar o map
		selecoes.clear();
		
		//retorna o tamanho do MAP
		System.out.println( selecoes.size() );
		
	}

}
