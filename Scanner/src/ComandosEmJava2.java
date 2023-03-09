import java.util.Scanner;
public class ComandosEmJava2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		System.out.println("Digite o numero ");
		num1 = input.nextInt();
		if(num1 >= 1 && num1 <= 9) {
			System.out.println("Numero permitido");
		}
		else {
			System.out.println("Numero nao permitido");
		}
	}
	
	
}
