import java.util.Scanner;
public class ComandosEmJava7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		System.out.println("Digite o primeiro numero");
		num1 = input.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = input.nextDouble();
		System.out.println("Digite o terceiro numero");
		num3 = input.nextDouble();
		CalculaMedia(num1, num2, num3);
	}
	private static void CalculaMedia(double num1,double num2, double num3) {
		num1 = num1 * 2;
		num2 = num2 * 3;
		num3 = num3 * 5;
		double media = (num1 + num2 + num3) / 10; 
		System.out.println("A media deu : "+media);
	}
}
