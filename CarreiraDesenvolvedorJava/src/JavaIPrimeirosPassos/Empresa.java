package JavaIPrimeirosPassos;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;;
	private int livre = 0;
	
	public Empresa(int quantidadeFuncionarios){
		this.empregados = new Funcionario[quantidadeFuncionarios];
	}

	public void adicionar(Funcionario funcionario) {
		this.empregados[this.livre] = funcionario;
		this.livre++;
	}

	public void mostraEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] != null) {
				System.out.println("Funcionario: " + empregados[i].getNome());
				System.out.println("Salario: " + empregados[i].getSalario());
				System.out.println("Departamento: " + empregados[i].getDepartamento());
			}
		}
	}

	public void mostraTodasAsInformacoes() {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] != null) {
				empregados[i].mostrar();
			}
		}
	}

	public boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == f) {
				return true;
			}
		}
		return false;
	}
	
	public Funcionario[] getFuncionarios(){
		return this.empregados;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios){
		this.empregados = funcionarios;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public int getLivre(){
		return this.livre;
	}
	
	public void setLivre(int livre){
		this.livre = livre;
	}
	
}
