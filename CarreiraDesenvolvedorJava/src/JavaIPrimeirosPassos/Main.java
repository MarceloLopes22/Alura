package JavaIPrimeirosPassos;
public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setData(new Data(1, 1, 1));;
		f1.setNome("Marcelo");
//		f1.mostrar();
		
		f1.setNome("Marcelo");
		f1.setSalario(3.000);
		f1.setNome("Mariana");
		Funcionario f2 = f1;
		
//		Funcionario f2 = new Funcionario();
//		f1.setNome("Marcelo");
//		f1.setSalario(3.000);
		
		if (f1 == f2) {
			System.out.println("São Iguais");
		}else{
			System.out.println("São Diferentes");
		}
		
		System.out.println(f2.getNome());
//		int[] array = new int[10];
//		for (int i : array) {
//			System.out.println(array[i]);
//			
//		}
	}
}
