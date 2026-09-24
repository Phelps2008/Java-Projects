package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		double C, F;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga a temperatura em Centígrados");
		C = leia.nextDouble();
		
		F = (9 * C + 160)/5;
		
		System.out.println("A temperatura em Centígrados para Fahrenhent é " + F + "°.");

	}
}
