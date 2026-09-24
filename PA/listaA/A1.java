package listaA;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		double v1, v2, v3, v4, sValores, mValores;
        Scanner leia = new Scanner (System.in);
        
		System.out.println("Digite o 1° valor");
        v1 = leia.nextDouble();
		System.out.println("Digite o 2° valor");
		v2 = leia.nextDouble();
		System.out.println("Digite o 3° valor");
		v3 = leia.nextDouble();
		System.out.println("Digite o 4° valor");
		v4 = leia.nextDouble();
		
		sValores = (v1 + v2 + v3 + v4);
		mValores = (sValores / 4);
		System.out.println("A média dos valores é " + mValores + ".");
	}
}
