
public class FluxoComErro {
	public static void main(String[] args) {
		System.out.println("ini met main");
		try {
		metodo1();
		}catch(ArithmeticException |NullPointerException /*|MinhaExecao*/ ex) {
			String msg = ex.getMessage();
			System.out.println("Exception :"+msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
		
		
	}
	private static void metodo1() {
		System.out.println("ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
	
	private static void metodo2() {
		System.out.println("ini do metodo 2");
		metodo2();
		System.out.println("chamando metodo 2");
		System.out.println("Fim do metodo 2");
		
	}
	
	
	
}
