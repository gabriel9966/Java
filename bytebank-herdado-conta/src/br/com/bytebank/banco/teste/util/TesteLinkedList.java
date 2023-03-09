package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {
	public static void main(String[] args) {
		System.out.println("Testando Linked List");
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(1, 1);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(2, 2);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(3, 3);
		lista.add(cc3);
		lista.remove(cc2);
		int i = 0;
		for(Conta conta: lista) {
			System.out.println(i);
			System.out.println(conta);
			i++;
		}
	}
}
