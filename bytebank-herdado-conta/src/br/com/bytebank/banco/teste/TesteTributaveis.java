package br.com.bytebank.banco.teste;/*pacote que faz parte */
import br.com.bytebank.banco.modelo.*;/*importo para todos os objetos criados o package*/


public class TesteTributaveis {

	public static void main(String[] args) {
		br.com.bytebank.banco.modelo.ContaCorrente cc= new br.com.bytebank.banco.modelo.ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		/*nome do pacote aonde está a classe e o nome da classe*/
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
