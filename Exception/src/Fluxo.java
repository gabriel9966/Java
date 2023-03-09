
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("ini met main");
		try {
		metodo1();
		}catch(ArithmeticException |NullPointerException |MinhaExecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception :"+msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
		
		
	}
	private static void metodo1() throws MinhaExecao {
		System.out.println("ini do metodo 1");
		//try {
			metodo2();
		//}catch(MinhaExecao es) {}
		System.out.println("Fim do metodo 2");
	}
	//exceção checked
	private static void metodo2() throws MinhaExecao {
		System.out.println("ini do metodo 2");
		
		/*ArithmeticException exc = new ArithmeticException();
		throw exc; ou*/
		//throw new ArithmeticException();
		throw new MinhaExecao("Minha primeira excecao");
		//System.out.println("Fim do metodo 2");
		
	}
	
	
	
}
