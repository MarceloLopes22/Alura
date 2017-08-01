package JavaIIOrientacaoObjeto;

public class ContaCorrente extends Conta{
	
	public void atualizar(double taxa){
		super.atualizar(taxa * 2);
	}
}
