package JavaIPrimeirosPassos;
class Funcionario {
	private String Nome;
	private String Departamento;
	private double Salario;
	private String Rg;
	private Data data;
	
	public Funcionario(){
		this("");
	}
	
	public Funcionario(String nome){
		this.Nome = nome;
	}
	
	public void receberAumento(double valor){
		this.Salario += valor;
	}
	
	public double getGanhoAnual(){
		return this.Salario * 12;
	}
	
	public void mostrar(){
		System.out.println("Nome: " + this.Nome);
		System.out.println("Departamento: " + this.Departamento);
		System.out.println("Salario: " + this.Salario);
		System.out.println("Rg: " + this.Rg);
		System.out.println("Data formatada: " + this.data.getFormatada());
		System.out.println("Calcula Ganho Anual: " + getGanhoAnual());
	}
	
	public String getNome(){
		return this.Nome;
	}
	
	public void setNome(String novoNome){
		this.Nome = novoNome;
	}
	
	public String getDepartamento(){
		return this.Departamento;
	}
	
	public void setDepartamento(String novoDepartamento){
		this.Departamento = novoDepartamento;
	}
	
	public Double getSalario(){
		return this.Salario;
	}
	
	public void setSalario(Double novosalario){
		this.Salario = novosalario;
	}
	
	public String getRg(){
		return this.Rg;
	}
	
	public void setRg(String novoRg){
		this.Rg = novoRg;
	}
	
	public Data getData(){
		return this.data;
	}
	
	public void setData(Data novaData){
		this.data = novaData;
	}
}