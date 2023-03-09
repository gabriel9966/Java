
public class TesteConexao {
	public static void main(String[] args) {
		
		
		
		try(Conexao cx = new Conexao()){
			cx.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		
		//------------------------------------
//		Conexao c = null;
//		try {
//			c = new Conexao();
//			c.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.prinln("deu erro na conexao")
//			
//		}finally {/*Sempre sera executado com ou sem erro , apenas um finaly*/
//			/*System.out.println("Finaly");
//			if(c != null) {
//				c.close();	
//			}
//			
//		}
	}
}
