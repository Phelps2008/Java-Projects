package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		double l1, l2, area;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro lado");
		l1 = leia.nextDouble();
		System.out.println("Informe o segundo lado");
		l2 = leia.nextDouble();
		
		area = (l1 * l2);
	
		System.out.println("A área do retângulo é " + area + ".");

	}
}
