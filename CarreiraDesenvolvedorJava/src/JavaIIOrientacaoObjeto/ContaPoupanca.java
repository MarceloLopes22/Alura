package JavaIIOrientacaoObjeto;

public class ContaPoupanca extends Conta{
	
	public void atualizar(double taxa){
		super.atualizar(taxa * 3);
	}
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor - 0.10;
	}
}
