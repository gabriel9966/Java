import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0;
		System.out.println("Quantos anos vc tem ");
		idade = input.nextInt();
		
		String nome ;
		System.out.println("Qual e seu nome ");
		nome = input.next();
		System.out.println("vc tem "+idade +" anos e seu nome e "+nome);
	}
}
