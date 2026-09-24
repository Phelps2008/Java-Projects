package ListaExtra;

import java.util.Scanner;

public class QP5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double descont, valor, result;
		System.out.println("Diga o valor da roupa:");
		valor = leia.nextDouble();
		descont = (valor * 0.075);
		 result = (valor - descont); 
		System.out.println("sua cota é de " + result + ".");
		

	}

}
