
public class TestaContaComExcecaoChecked {
	public static void main (String[] srgs) {
		Conta c = new Conta();
		try {
		c.deposita();
		}catch(MinhaExecao ex) {
			System.out.println("Tratamento....");
		}
			
		
	}
}
