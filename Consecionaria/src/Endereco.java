//abstract nao pode ser instanciada
public abstract class Endereco {
	private String estado;
	private String rua;
	private int numeroDcasa;
	private int cep;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumeroDcasa() {
		return numeroDcasa;
	}
	public void setNumeroDcasa(int numeroDcasa) {
		this.numeroDcasa = numeroDcasa;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
}
