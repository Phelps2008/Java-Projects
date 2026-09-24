package ListaD;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("Digite o 1° número.");
		A = leia.nextInt();
		System.out.println("Digite o 2° número.");
		B = leia.nextInt();
		System.out.println("Digite o 3° número.");
		C = leia.nextInt();
		
		if (A < B) {
			if (B < C) {
				System.out.println("A ordem decrescente dos seus números são: " + A + B + C);
				
			}	
		}
				
		if(C < A) {
			if(A < B) {
				System.out.println("A ordem decrescente dos seus números são: " + C + A + B);
			}
		}
		
		if(C < B) {
			if (B < A) {
				System.out.println("A ordem decrescente dos seus números são: " + C + B + A);
			}
		}
		
		if(B < C) {
			if (C < A) {
				System.out.println("A ordem decrescente dos seus números são: " + B + C + A);
			}
		}
	
		if(A < C) {
			if (C < B) {
				System.out.println("A ordem decrescente dos seus números são: " + A + C + B);
			}
		}
		
		if(B < A) {
			if (A < C) {
				System.out.println("A ordem decrescente dos seus números são: " + B + A + C);
			}
		}
		
	}
}
