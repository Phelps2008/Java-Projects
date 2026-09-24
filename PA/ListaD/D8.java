package ListaD;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, num2, div, div2;
		System.out.println("Qual o primeiro numero?");
		num = leia.nextInt();
		System.out.println("Qual o segundo numero ?");
		num2 = leia.nextInt();
		if (num > num2) {
			div = (num2 / num);
			System.out.println("o resultado da divisão deles é " + div );
			
		}
		if (num2 > num) {
			div2 = (num / num2);
			System.out.println("o resultado da divisão deles é " + div2 );
			
		}
	}

}
