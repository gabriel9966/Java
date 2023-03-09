import java.util.Scanner;
public class ComandosEmJava1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Digite o primeiro numero ");
		num1 = input.nextInt();
		System.out.println("Digite o segundo numero ");
		num2 = input.nextInt();
		maiorNumero(num1,num2);
	}

	private static void maiorNumero(int num1, int num2) {
		if(num1 == num2) {
			System.out.println("Numeros iguais");
		}
		if(num1 > num2) {
			System.out.println("Primeiro numero maior que o segundo");
		}
		if(num2 > num1) {
			System.out.println("Segundo numero maior que o primeiro");
		}
	}
}
