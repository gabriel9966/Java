
public  class Cliente extends Endereco {
	private String nome;
	private int idade;
	
	public Cliente(String nome,int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
}
