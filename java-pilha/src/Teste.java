public class Teste{
	public static void main(String[] args) {
		System.out.println("Inicio do main ");
		metodo1();
		System.out.println("Fim do main ");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		
	}
	
	public static void metodo2() {
		System.out.println("Inicio do metodo2");
		for(int i = 0;i<=10;i++) {
			System.out.println(i);
			try{
				int y = 10;
				int divi = y/0;
			}catch(ArithmeticException ex) {
				System.out.println("Nao pode fazer divisao por zero");
				
			}
			
		}
		
		System.out.println("Fim do metodo2");
		
	}
	//a exceção muda o fluxo do programa
	
	
	
	
}