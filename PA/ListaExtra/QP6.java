package ListaExtra;

import java.util.Scanner;

public class QP6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double  maior, menor, sim;
      System.out.println("qual o valor ?");
		sim = leia.nextDouble();
		 
		if (sim > 5) {
		System.out.println("maior que 5");
		}
		else {
			System.out.println("menor que 5");
		}
	}
}
