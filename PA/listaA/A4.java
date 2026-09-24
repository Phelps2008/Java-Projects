package listaA;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double r1, al, vol;
		System.out.println("qual o raio da lata?");
		r1 = leia.nextDouble();
		System.out.println("Qual a altura da lata");
		al = leia.nextDouble();
				
		vol = (3.14159 * r1 * r1 * al);
		System.out.println("o volume da lata é: " +  vol  + ".");
	}
}