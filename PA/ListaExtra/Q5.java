package ListaExtra;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double Sf, Bonus, SB;
		
		System.out.println("Me informe seu sálario fixo:");
		Sf = leia.nextDouble();
		
		System.out.println("Me informe o valor de carros vendidos:");
		Bonus = leia.nextDouble();
		
		SB = ((Bonus * 0.05) + Sf);
		
		System.out.println(("Seu sálario total é: ") + SB + ("."));

	}

}
