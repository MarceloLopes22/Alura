package JavaIPrimeirosPassos;
class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(){}
	
	public Data(int d,int m, int a){
		this.dia = d;

		if (String.valueOf(m).length() < 2) {
			System.out.println("Por favor informe o mes com 2 digitos.");
		}else {
			this.mes = m;
		}
		this.ano = a;
	}
	
	String getFormatada(){
		return String.valueOf(this.dia+"/"+this.mes+"/"+this.ano);
	}
	
	public static void main(String[] args) {
		Data d = new Data(11, 10, 1991);
		System.out.println(d.getFormatada());
	}
}