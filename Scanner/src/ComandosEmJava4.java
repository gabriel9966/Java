import java.util.Scanner;
public class ComandosEmJava4 {

	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("Digite o primeiro numero");
		num1 = input.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = input.nextInt();
		System.out.println("Digite o terceiro numero");
		num3 = input.nextInt();
		menorNumero(num1, num2, num3);
		
	}
	private static void menorNumero(int num1, int num2,int num3) {
		if(num1 < num2 && num1 < num3) {
			System.out.println("Primeiro numero e o menor");
		}else if(num2 < num1 && num2 < num3) {
			System.out.println("Segundo numero e o menor");
		}else {
			System.out.println("Terceiro numero e o menor");
		}
		
	}
	

}
