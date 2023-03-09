package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc = new ContaCorrente(11, 12);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(22,23);
		lista.add(cp);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		//contain dentro do array
		System.out.println(lista.contains(cp));
		Conta cc1 = new ContaCorrente(33,33);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(11, 12);
		lista.add(cc2);
		boolean existe = lista.contains(cc2);
		System.out.println("Ja existe "+existe);
		contain(lista, cp);
		contain(lista, cc1);
		for(Conta conta : lista) {
			if(conta == cc2) {
				System.out.println("Possui a conta cc2");
			}
		}
		
	}
	public static void contain(ArrayList<Conta> ob1,Conta c ) {
		if( ob1.contains(c) == true) {
			System.out.println("Tem dentro do array a conta :"+c);
		}
		else {
			System.out.println("Nao tem dentro do array a conta :"+c);
		}
	}
}

