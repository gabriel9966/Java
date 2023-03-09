
public abstract class Veiculos implements Comisao {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private double preco;
	private Cliente cliente;
	private static int quantDeCarros = 0;
	
	public Veiculos(String marca,String modelo){
		
		Veiculos.quantDeCarros++;
		this.modelo = modelo;
		this.marca = marca;
		if(cliente == null) {
		System.out.println("Inicie um cliente ");}
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	@Override
	public double getComisao() {
		return preco * 0.05;
	}
	
	public int getQuantidade() {
		return quantDeCarros;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	
}
