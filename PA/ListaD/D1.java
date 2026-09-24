package ListaD;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num1, num2;
		System.out.println("qual valor do 1° número? ");
		num1 = leia.nextDouble();
		System.out.println("qual o valor do 2° número?" );
		num2 = leia.nextDouble();
		if (num1 > num2) {
		System.out.println("o 1° número é maior ");
		}
		if (num2 > num1) {
			System.out.println("o 2° número é maior");
		}
		if (num1 == num2) { 
			System.out.println("ambos são iguais");
		}
	}
}
