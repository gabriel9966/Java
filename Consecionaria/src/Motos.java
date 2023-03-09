
public class Motos extends Veiculos {
	public Motos(String marca,String modelo) {
		super(marca,modelo);
	}
	private int cilindrada; 
	private String escapamento;
	private String freio;
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getEscapamento() {
		return escapamento;
	}
	public void setEscapamento(String escapamento) {
		this.escapamento = escapamento;
	}
	public String getFreio() {
		return freio;
	}
	public void setFreio(String freio) {
		this.freio = freio;
	}
}
