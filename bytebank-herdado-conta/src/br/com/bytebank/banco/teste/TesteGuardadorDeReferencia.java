package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencia {
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(100,100);
		cc.deposita(582);
		
		
		ContaCorrente cc2 = new ContaCorrente(101,101);
		guardador.adiciona(cc2);
		System.out.println(cc.getSaldo());
		guardador.adiciona(cc);
		guardador.getQuantidade();
		System.out.println("-//-");
		guardador.getContas();
		System.out.println("-//-");
		Conta ref = guardador.getReferencias(1);
		System.out.println(ref);
	}
}
