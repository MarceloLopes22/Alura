package JavaIIOrientacaoObjeto;

public class Conta {
	protected double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	
	void depositar(double valor){
		this.saldo += valor;
	}
	
	double sacar(double valor){
		return this.saldo -= valor;
	}
	
	void atualizar(double taxa){
		this.saldo = this.saldo +(this.saldo * taxa);
	}
}
