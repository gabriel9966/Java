
public class Teste {

	public static void main(String[] args) {
		Carro cr = new Carro("Ferrari","458");
		Cliente cl = new Cliente("gabriel",18);
		cr.setCliente(cl);
		cr.getCliente().setRua("foda-se");
		System.out.println(cr.getCliente().getRua());
		
		System.out.println(cr.getQuantidade());
		Motos mt = new Motos("yamaha","mt-03");
		mt.setPreco(25000);
		System.out.println(mt.getComisao());
	}

}
