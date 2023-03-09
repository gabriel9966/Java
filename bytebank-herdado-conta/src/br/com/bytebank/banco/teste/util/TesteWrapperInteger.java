package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InterruptedNamingException;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade1 = 20;//primitivo, Integer
		Integer idadeRef = new Integer(21);
		Integer idadeRef2 = new Integer(50);
		Integer idadeRef3 = Integer.valueOf(65);
		int idadeRef01 = idadeRef3.intValue();//unboxing
		
		//Integer representa o tipo primitivo int como um objetos
		List<Integer> numeros = new ArrayList<Integer>(); 
		
		numeros.add(idade1);
		numeros.add(idadeRef);
		numeros.add(idadeRef2);
		numeros.remove(1);
		numeros.add(idadeRef3);
		for(int i =0 ; i < numeros.size();i++) {
			System.out.println("Posicao :"+i+" , tem o numero :"+numeros.get(i));
		
		}
		//transformar um primitivo em um objeto se chama autoboxing
		System.out.println(idadeRef01);
		
		
		String s = args[0];
		Integer num = Integer.valueOf(s);//autoboxing
		System.out.println(num);
		
		int num1 = Integer.parseInt(s);
		System.out.println(num1);
		System.out.println(num.doubleValue());
		System.out.println(Integer.MAX_VALUE);
	}
	
}
