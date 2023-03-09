package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(10, 11);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(10, 11);
		
		Conta cc2 = new ContaCorrente(12, 13);
		lista.add(cc2);
		
		
		boolean existe = lista.contains(cc1);
		System.out.println("Ja existe :"+existe);
		
		for(Conta conta:lista) {
			if(conta == cc1) {
				System.out.println("Ja possui a conta cc1");
			}
		}
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		// equals é um método para ver se os objetos são iguais
		
		
		Conta cc10 = new ContaCorrente(100, 101);
		Conta cc20 = new ContaCorrente(120, 122);
		Conta cc11 = new ContaCorrente(100,101);
		System.out.println("E igual :"+cc10.equals(cc20));
		System.out.println("E igual :"+cc10.equals(cc11));
	}

}
