import java.util.Scanner;
public class Baskara {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		System.out.println("Digite o valor de a ");
		a = input.nextDouble();
		System.out.println("Digite o valor de b ");
		b = input.nextDouble();
		System.out.println("Digite o valor de c ");
		c = input.nextDouble();
		baskara(a,b,c);
		
	}
	private static void baskara(double a, double b ,double c) {
		delta(a,b,c);
		mensagem(a, b, c);
		xUm(a, b, c);
		xDois(a, b, c);
	}
	private static double delta(double a,double b, double c) {
		double Delta = (b * b) - (4*a)*c;
		return Delta;
	}
	private static void mensagem(double a,double b, double c) {
		double Delta = delta(a,b,c);
		if(Delta > 0) {
			System.out.println("Delta possui duas raizes reais : " + Delta);
		}else if(Delta < 0) {
			System.out.println("Delta nao possui  raizes reais : " + Delta);
		}else {
			System.out.println("Delta possui uma unica raiz real : " + Delta);
		}
	}
	private static void xUm(double a,double b, double c) {
		double Xum = ((-b) + Math.sqrt(delta(a,b,c)))/(2*a);
		System.out.println("X1 : "+Xum);
	}
	private static void xDois(double a,double b, double c){
		double Xdois = ((-b) - Math.sqrt(delta(a,b,c)))/(2*a);
		System.out.println("X2 : "+Xdois);
	}
}
