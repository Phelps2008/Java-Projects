package ListaExtra;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double ANT, POS, NUM;
		
		System.out.println("Qual valor quer adicionar");
		NUM = leia.nextDouble();
		
		POS = (NUM + 1);
		ANT = (NUM - 1);
		System.out.println(("seu antecessor é ") + ANT + (" seu numero é ") + NUM + (" seu posterior é ") + POS + ("."));

	}

}
