package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		// <> só sabe guardar objetos do tipo conta
		ArrayList<Conta> ar = new ArrayList<Conta>();
		
		//Cliente cl = new Cliente();
		
		//ar.add(cl);
		
		Conta cc = new ContaCorrente(100,100);
		ar.add(cc);
		
		ContaCorrente cc2 = new ContaCorrente(101,101);
		ar.add(cc2);
		
		System.out.println("Tamanho :"+ar.size());
		Conta ref = /*(Conta)*/ ar.get(0);
		System.out.println(ref.getNumero());
		
		//ar.remove(0);
		
		
		Conta cc3 = new ContaCorrente(102,102);
		ar.add(cc3);
		
		
		ContaCorrente cc4 = new ContaCorrente(103,103);
		ar.add(cc4);
		System.out.println(ar.size());
		
		for(int i = 0;i < ar.size();i++) {
			//Object oref = ar.get(i);
			//System.out.println(oref);
		}
		//para cada dentro da lista fassa
/*		for(Object oref : ar) {
			System.out.println(oref);
		}*/
		for(Conta conta : ar) {
			System.out.println(conta);
		}
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("Julio");
		nomes.add("Lucas");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
	}

}
/* No array list quando se exclue algo não fica uma posição vazia todo o array e movido e substitui o espaço vazio*/