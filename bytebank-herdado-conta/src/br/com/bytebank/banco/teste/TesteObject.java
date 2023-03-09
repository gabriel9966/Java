package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//		System.out.println();
//		System.out.println(1);
//		System.out.println("g");
//		System.out.println(true);
		
		Object cc = new ContaCorrente(100,891);
		//polimorfismo referência genérica
		ContaPoupanca cp = new ContaPoupanca(101,582);
		
		System.out.println("cp = "+cp);
		System.out.println("cp = "+cp.toString());
		
		System.out.println("cc = "+cc.toString());
		System.out.println("cc = "+cc);

	}
	/*sobre carga*/
	public static void println() {
		
	}
	public static void println(char c) {
			
		}
	public static void println(float f) {
		
	}
	public static void println(int i) {
		
	}
	public static void println(boolean b) {
		
	}
	public static void println(Object b) {
		
	}

}
