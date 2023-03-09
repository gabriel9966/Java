
	public class FluxoComErro {
//protected pode ser acessado pelas classes filhas 
	   //static = da classe, dentro de static não existe this
// métodos estáticos não precisam que seja passado um parâmetro


		    public static void main(String[] args) {
		        System.out.println("Ini do main");
		        try{//tenta executar esse código / ele é perigoso 
		        	metodo1();
		        }catch(ArithmeticException | NullPointerException /*| MinhaException*/ ex) {//se der esse erro faça isso / capitura 
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
//é estatico porque é um método sem referência
		    private static void metodo2() {
		        System.out.println("Ini do metodo2");
		        /*ArithmeticException execption = new ArithmeticException("Deu errado !");
			       throw execption;*/
		        //throw = joga na pilha de execução uma Exception
		       
		        //throw new MinhaException("Minha exception!");//criando uma exception
		        //System.out.println("Fim do metodo2");
		    }
		}
