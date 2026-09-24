package vetores;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador, iteracao = 1;
		
		System.out.println("Quantas repetições para o FOR?");
		contador = sc.nextInt();
		
		for (iteracao = 1; iteracao <= contador; iteracao++) {
			System.out.println("Executando o for pela " + iteracao + "ª vez.");
		}
		
		
		for (int i = 0; i < 10; i++) {
			//System.out.println("Boa tarde!");
			System.out.println(i);
		}
	}
}