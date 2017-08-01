package JavaDominandoCollections;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario>{

	// metodo compare
	@Override
	public int compare(Funcionario funcionario, Funcionario funcionario2) {
		return funcionario.getIdade() - funcionario2.getIdade();
	}
}