package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
		System.out.println("Testando String");
		
		String nome = "Gabriel";// = object literal
		/*
		System.out.println(nome);
		//String é uma classe, mas vem no pacote padrão(java lang) por isso não precisa ser inicializada
		String nome2 = new String("Antonio");
		System.out.println(nome2);
		//não funciona pq Strings são imutaveis, nascem e morrem do mesmo jeito
//		String nome4 = nome.replace("b", "B");
//		System.out.println(nome);
//		System.out.println(nome4);
		
		
		String nome3 = nome.toLowerCase();
		System.out.println(nome3);
		*/
//		char c = nome.charAt(0);
//		System.out.println(c);
//		
//		int n = nome.indexOf("a");
//		System.out.println(n);
//		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		for(int i = 0; i < nome.length() ; i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		String vazio = "    ";
		//tira todo os espaços dentro de uma String
		String vazio2 = vazio.trim();
		// a String está vazio ?
		System.out.println(vazio2.isEmpty());
		
		String nome2 = "              Gabriel Antonio            ";
		System.out.println(nome2);
		String nome3 = nome2.trim();
		System.out.println(nome3);
		//contain dentro da String 
		System.out.println(nome3.contains("Antonio"));
		
		
	}
}
