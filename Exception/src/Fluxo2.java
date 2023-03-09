
public class Fluxo2 {
	public static void main(String[] args) {
		System.out.println("ini met main");
		metodo1();
		System.out.println("Fim do main");
		
		
	}
	private static void metodo1() {
		System.out.println("ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
	
	private static void metodo2() {
		System.out.println("ini do metodo 2");
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(i);
			
			try {
			int a = 10/0; 
			} catch(ArithmeticException ex) {
				String msg = ex.getMessage();
				System.out.println("Erro :ArithmeticException " +msg );
				ex.printStackTrace();
			}
		}
		System.out.println("Fim do metodo 2");
		
	}
}
