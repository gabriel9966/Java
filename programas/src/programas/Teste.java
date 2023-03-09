package programas;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		System.out.println("Digite o primeiro numero ");
		Scanner input = new Scanner(System.in);
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo numero ");
		int numero2 = input.nextInt();
		System.out.print(numero1+" * "+numero2+ " = ");
		for(int i = 1; i <= numero2; i++) {
			System.out.print(numero1);
			if(i != numero2) {
				System.out.print(" + ");
			}
		}
		
	}
}
