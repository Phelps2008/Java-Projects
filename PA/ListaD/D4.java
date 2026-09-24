package ListaD;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, c1, c2;
		
		System.out.println("Digite o 1° número!");
		num1 = leia.nextInt();
		System.out.println("Digite o 2° número!");
		num2 = leia.nextInt();
		
		c1 = (num1 - num2);
		c2 = (num2 - num1);
				
		if (num1 > num2) {
			System.out.println("O 1° valor que você digitou é " + c1 + " números maior do que o 2°.");
		}
		if (num2 > num1) {
			System.out.println("O 2° valor que você digitou é " + c2 + " números maior do que o 1°.");
		}

	}

}
