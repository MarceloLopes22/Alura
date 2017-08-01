package JavaDominandoCollections;

import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {
	public static void main(String[] args) {
		Recibo recibo = new Recibo();
		recibo.setValor(1);
		
		Recibo recibo1 = new Recibo();
		recibo1.setValor(2);
		
		Recibo recibo2 = new Recibo();
		recibo2.setValor(3);
		
		Set<Recibo> treeSet = new TreeSet<Recibo>();
		treeSet.add(recibo);
		treeSet.add(recibo1);
		treeSet.add(recibo2);
	}
}
