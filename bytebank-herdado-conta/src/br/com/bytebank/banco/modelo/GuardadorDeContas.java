package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Conta[] referencia;
	private int posicao;
	public GuardadorDeContas() {
		this.referencia = new Conta[10];
		this.posicao = 0 ;
	}
	public void adiciona(Conta ref) {
		this.referencia[this.posicao] = ref;
		System.out.println(ref+" foi guardada na posicao :"+this.posicao);
		this.posicao++;
	}
	public void getContas() {
		
		for(int i = 0;i < this.referencia.length; i++) {
			if(this.referencia[i] != null) {
			System.out.println(this.referencia[i]);
			}
		}
	}
	public void getQuantidade() {
		System.out.println("A quantidade de elementos e :"+(posicao));
	}
	public Conta getReferencias(int pos) {
		return this.referencia[pos];
	}
	
}
