import java.util.Scanner;
public class ComandosEmJava5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		int parada = 4;
		int[] array = new int[parada];
		for(int comeco = 0; comeco < 4 ;comeco++) {
			System.out.println("Digite o numero ");
			num = input.nextInt();
			array[comeco] = num;
		}
		while(num2 < parada) {
			if(array[num2] % 2 == 0) {
				System.out.println(array[num2]+" E divisivel por 2");
			}
			if(array[num2] % 3 == 0) {
				System.out.println(array[num2]+" E divisivel por 3");
			}
			num2 ++;
		}
	}
}
