package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;
import br.com.bytebank.banco.especial.*;
//javadoc
/**
 * 
 * @author elon musk
 * @version 0.1
 * teste da clase conta
 *
 */
//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
						//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		/*Full Qualified Name FQN é o nome = modelo.ContaCorrente */
		//ContaCorrente nova = null;
		//nova.deposita(50);
		//System.out.println(nova.saldo);
		
		ContaEspecial ce = new ContaEspecial(343,423);
		ce.deposita(6666);/*
		saldo não é visível pq é protected , não é visível nessa classe*/
		System.out.println("Conta especial saldo :"/*ce.saldo*/);
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
	
		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		 
		System.out.println(cc.getTotal());

	}

}
