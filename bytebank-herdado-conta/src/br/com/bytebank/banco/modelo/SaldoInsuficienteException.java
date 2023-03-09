package br.com.bytebank.banco.modelo;


public class SaldoInsuficienteException extends /*Runtime*/Exception {
	//construtor
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
