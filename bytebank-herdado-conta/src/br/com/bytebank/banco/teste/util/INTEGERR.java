package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class INTEGERR {
	public static void main(String[] args) {
		//Integer representa o tipo primitivo int como um objetos
		Integer idadeRef = Integer.valueOf(30);//autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double dRef = Double.valueOf(679);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
		System.out.println(dRef.intValue());
		
		Boolean bool = Boolean.TRUE;
		System.out.println(bool.booleanValue());
		
		
		Number n = Float.valueOf(65.98f);
		System.out.println(n);
		
		List<Number> numeros = new ArrayList<Number>();
		numeros.add(dRef);
		numeros.add(idadeRef);
		numeros.add(n);
		System.out.println("//****//");
		for(Number numero:numeros) {
			System.out.println(numero);
		}
	}

	public static int compare(int numero, int numero2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
