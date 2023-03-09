package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		ContaCorrente[] Contas = new ContaCorrente[6];
		ContaCorrente c = new ContaCorrente(150,890);
		ContaCorrente c1 = new ContaCorrente(001, 001);
		ContaCorrente c2 = new ContaCorrente(002, 002);
		ContaCorrente c3 = new ContaCorrente(003, 003);
		ContaCorrente c4 = new ContaCorrente(004, 004);
		Contas[0] = c;
		Contas[1] = c1;
		Contas[2] = c2;
		Contas[3] = c3;
		Contas[4] = c4;
		
		for(int i = 0;i < Contas.length - 1; i++) {
			System.out.println(Contas[i]);
		}
		System.out.println(Contas[1].getNumero());
		
		try {
			System.out.println(Contas[5].getNumero());
		}catch(NullPointerException ex) {
			System.out.println("Esta nulo");
		}
		
		
		ContaCorrente referencia = Contas[0];
		referencia.setNumero(100);
		System.out.println(Contas[0].getNumero());
		System.out.println(c.getNumero());
		
		
		int[] ArrayLiteral = {1,5,8,10};
		System.out.println(ArrayLiteral[0]);
		
		Conta[] contasGeral = new Conta[10];
		contasGeral[0] = c;
		System.out.println(contasGeral[0]);
		ContaPoupanca cp = new ContaPoupanca(753, 764);
		contasGeral[1] = cp;
		System.out.println(contasGeral[1]);
		
		ContaPoupanca cp01 = new ContaPoupanca(852,963);
		Conta[] Contaa = new Conta[5];
		Contaa[0] = cp01;
		Object[] Conta1 = new Object[5];
		Conta1[0] = cp01;
		//não funciona pq ele olha no array e não no objeto
		//ContaPoupanca referenciaa = Contaa[0];
		//mas assim funciona diz que o tipo é conta poupança
		ContaPoupanca referenciaa = (ContaPoupanca) Contaa[0];//type cast
		System.out.println("Numero :"+referenciaa.getNumero());
		System.out.println("Numero :"+Contaa[0].getNumero());
		//não compila  pq e uma referencia do tipo objeto
		//System.out.println("Numero :"+Conta1[0].getNumero());
		
		//mais genérico possível
		Object[] obj = new Object[5];
		obj[0] = c;
		
		//type cast
		//implícito
		int num1 = 5;
		double num2 = num1;
		System.out.println(num2);
		//explícito
		double num3 = 6.75;
		int num4 = (int) num3;
		System.out.println(num4);
		
		
 	}
}
