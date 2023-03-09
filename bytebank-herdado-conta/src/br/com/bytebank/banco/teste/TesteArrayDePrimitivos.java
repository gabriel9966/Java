package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	public static void main(String[] args) {
		// Array []
		int idade1 = 15;
		int idade2 = 16;
		int idade3 = 20;
		int idade4 = 22;
		int idade5 = 14;
		int idade6 = 21;
		// Array é um objeto , preciso dizer quantos vai caber no array
		int [] idades = new int[6];
		int tamanhoDoArray = idades.length;
		idades[0] = idade1;
		idades[1] = idade2;
		idades[2] = idade3;
		idades[3] = idade4;
		idades[4] = idade5;
		idades[5] = idade6;
		System.out.println("O array tem "+tamanhoDoArray+" posicoes");
		
		for(int i = 0; i < idades.length;i++) {
			System.out.println(idades[i]);
		}
		
	}
}
