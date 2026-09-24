package ListaD;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("qual seu numero de 0 a 10? ");
		num = leia.nextInt();
		if (num == 0) {
			System.out.println("zero");
		}
		if (num == 1) {
			System.out.println("um");
		}
		if (num == 2) {
			System.out.println("dois");
		}
		if (num == 3) {
			System.out.println("três");
		}
		if (num == 4) {
			System.out.println("quatro");
		}
		if (num == 5) {
			System.out.println("cinco");
		}
		if (num == 6) {
			System.out.println("seis");
		}
		if (num == 7) {
			System.out.println("sete");
		}
		if (num == 8) {
			System.out.println("oito");
		}
		if (num == 9) {
			System.out.println("nove");
		}
		if (num == 10) {
			System.out.println("dez");
		}
	}

}
