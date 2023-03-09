public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 23334);
		
		Cliente cl = new Cliente();
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é : " + Conta.getTotal());
		
		
		conta.setTitular(cl);
		conta.getTitular().setNome("Gabriel");
		System.out.println("Nome :"+conta.getTitular().getNome());
		
		
		Conta gg = new Conta(4651,654654);
		
		
	}
	
}
