package ListaD;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("qual o seu numero de 1 a 10?");
		num = leia.nextInt();
		if (num > 5) {
			if (num < 10) {
				System.out.println("seu numero está entre 5 e 10");
				
			}
		}
		if (num < 5) {
			System.out.println("seu numero é menor que 5");
		}
		if (num < 10) {
			System.out.println("seu numero é menor que 10");
	   }
		if (num == 5) {
			System.out.println("seu numero é igual a 5");
	}
}
}
