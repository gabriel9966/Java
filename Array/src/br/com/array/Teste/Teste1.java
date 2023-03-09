package br.com.array.Teste;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		Scanner input = new Scanner( System.in );;
			for(int i = 0; i < 10 ; i++) {
				System.out.println("Digite o numero da posicao "+i+" :");
				array1[i] = input.nextInt();
			}
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("Numero "+array1[i]+" na posicao "+i);
		}
			
		input.close();

	}

}
