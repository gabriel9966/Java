import java.util.Scanner;

public class Urna {
	public static void main(String[] args) {
		int numero = 0;
		
		 double ciro = 0;
		 double bolsonaro = 0;
		 double lula = 0;
		
		
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(System.lineSeparator()+"Digite o numero ou 0 para parar ");
			numero = input.nextInt();
			switch(numero) {
			case 1:
				lula+=1;
				System.out.println("voce votou no lula");
				break;
			case 2:
				bolsonaro+=1;
				System.out.println("voce votou no bolsonaro");
				break;
			case 3:
				ciro+=1;
				System.out.println("voce votou no ciro");
				break;
			default:
				System.out.println("O numero escolhido nao pertence a nenhum candidato tente novamente !");
			}
		}while(numero != 159753);
		double total = ciro + bolsonaro + lula;
		System.out.println("Lula :"+lula);
		System.out.println("Bolsonaro :"+bolsonaro);
		System.out.println("Ciro :"+ciro);
		System.out.println(System.lineSeparator()+"Total :"+total);
	}

}
