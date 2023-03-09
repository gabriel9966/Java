public class Carro extends Veiculos {
	public Carro(String marca,String modelo) {
		super(marca,modelo);
	}
	private String tracao;
	private String cambio;
	private int ocupantes;
	private double motor;
	
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getTracao() {
		return tracao;
	}
	public void setTracao(String tracao) {
		this.tracao = tracao;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public int getOcupantes() {
		return ocupantes;
	}
	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	
}
