package br.com.byteBank.biblioteca;/*pacote que faz parte*/

import br.com.bytebank.banco.modelo.ContaCorrente;

public class ByteBankBibliotecaTeste {
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(123,321);
		c.deposita(1222);
		System.out.println(c.getSaldo());
	}
}
