package listaF;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4, num5;

		System.out.println("qual o primeiro numero ?");
		num1 = leia.nextInt();
		
		System.out.println("qual o segundo numero ?");
		num2 = leia.nextInt();
		
		System.out.println("qual o terceiro numero ?");
		num3 = leia.nextInt();
		
		System.out.println("qual o quarto numero ?");
		num4 = leia.nextInt();
		
		System.out.println("qual o quinto numero ?");
		num5 = leia.nextInt();
		
		 if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("seu maior numero é " + num1+ " e o menor numero é "  + num2);
			
		}else if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println("seu maior numero é " + num1+ " e o menor numero é "  + num3);
			
		}else if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num4 < num1 && num4 < num3 && num4 < num2 && num4 < num5) {
			System.out.println("seu maior numero é " + num1+ " e o menor numero é "  + num4);
			
		}else if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num5 < num1 && num5 < num3 && num5 < num4 && num5 < num2) {
			System.out.println("seu maior numero é " + num1+ " e o menor numero é "  + num5);
			
		}else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("seu maior numero é " + num2+ " e o menor numero é "  + num1);
			
		}else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
			System.out.println("seu maior numero é " + num2+ " e o menor numero é "  + num3);
			
		}else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
			System.out.println("seu maior numero é " + num2+ " e o menor numero é "  + num4);
			
		}else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
			System.out.println("seu maior numero é " + num2+ " e o menor numero é "  + num5);
			
		}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("seu maior numero é " + num3+ " e o menor numero é "  + num1);
			
		}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("seu maior numero é " + num3+ " e o menor numero é "  + num2);
			
		}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			System.out.println("seu maior numero é " + num3+ " e o menor numero é "  + num4);
			
		}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
			System.out.println("seu maior numero é " + num3+ " e o menor numero é "  + num5);
			
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("seu maior numero é " + num4+ " e o menor numero é "  + num1);
			
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("seu maior numero é " + num4+ " e o menor numero é "  + num2);
			
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println("seu maior numero é " + num4+ " e o menor numero é "  + num3);
			
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
			System.out.println("seu maior numero é " + num4+ " e o menor numero é "  + num5);
			
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("seu maior numero é " + num5+ " e o menor numero é "  + num1);
			
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("seu maior numero é " + num5+ " e o menor numero é "  + num2);
			
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println("seu maior numero é " + num5+ " e o menor numero é "  + num3);
			
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num1) {
			System.out.println("seu maior numero é " + num5+ " e o menor numero é "  + num4);
  }
 }
}