package ListaD;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num;
		System.out.println("Digite teu número desejado:");
		num = leia.nextDouble();
		
		if (num > 100) {
			System.out.println("Seu número é maior que 100.");
		}
		if (num == 100) { 
			System.out.println("Seu número é igual a 100.");
		}
		if (num < 100) {
			System.out.println("Seu número é menor que 100.");
		}
	}

}
