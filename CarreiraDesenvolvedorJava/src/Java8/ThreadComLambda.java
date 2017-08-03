package Java8;

public class ThreadComLambda {

	public static void main(String[] args) {
		
		Runnable run = () ->{System.out.println("Executando um Runnable");};
		new Thread(run).start();
	}

}
