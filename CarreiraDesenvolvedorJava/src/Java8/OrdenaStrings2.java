package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings2 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Compare
		Comparator<String> comparador = new ComparetorOrdena();
		palavras.sort(comparador);
		
		Consumer<String> ordenador = new OrdenadorDeStrings();
		palavras.forEach(ordenador);
	}
}

class ComparetorOrdena implements Comparator<String>{
	@Override
	public int compare(String palavra1, String palavra2) {
		if (palavra1.length() < palavra2.length()) {
			return -1;
		}else if (palavra1.length() > palavra2.length()) {
			return 1;
		}
		
		return 0;
	}
	
}

class OrdenadorDeStrings implements Consumer<String>{

	@Override
	public void accept(String palavra) {
		System.out.println(palavra);
	}
	
}
