package br.com.bytebank.banco.teste;
/*ctrl + shift + o = importa tudo que precisa*/
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	public static void main (String []args) {
		Conta conta = new ContaCorrente(123, 234);	
		conta.deposita(500);
		System.out.println("saldo :"+conta.getSaldo());
		
		try {
			conta.saca(1000);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Ex :"+ex.getMessage());
		}
		
		System.out.println("Saldo :"+conta.getSaldo());
		
		
		
	}
}
