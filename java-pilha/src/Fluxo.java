
	public class Fluxo {
//protected pode ser acessado pelas classes filhas 
	   //static = da classe, dentro de static não existe this
// métodos estáticos não precisam que seja passado um parâmetro
	

		    public static void main(String[] args) {
		        System.out.println("Ini do main");
		        try{
		        	metodo1();
		        }catch(ArithmeticException | NullPointerException ex) {//se der esse erro faça isso
	            	//System.out.println(ex);
	            	//System.out.println("ArithmeticException");
		        	String erro = ex.getMessage();
		        	System.out.println("Exception :"+erro);
		        	ex.printStackTrace();//ele imprime a pilha de execução
		        }
		        System.out.println("Fim do main");
		    }

		    private static void metodo1() {
		        System.out.println("Ini do metodo1");
		        metodo2();// = método sem referência
		        
		        System.out.println("Fim do metodo1");
		    }
//é setatico porque é um método sem referência
		    private static void metodo2() {
		        System.out.println("Ini do metodo2");
		        /*ArithmeticException execption = new ArithmeticException("Deu errado !");
			       throw execption;*/
		        //throw = joga na pilha de execução uma Exception
		        throw new ArithmeticException("Deu errado !");
		        
		        //System.out.println("Fim do metodo2");
		    }
		}

