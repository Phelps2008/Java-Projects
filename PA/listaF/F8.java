package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4;
		
		System.out.println("qual o primeiro numero");
		n1 = leia.nextInt();
		
		System.out.println("qual o segundo numero");
		n2 = leia.nextInt();
		
		System.out.println("qual o terceiro numero");
		n3 = leia.nextInt();
		
		if (n1 < n2 && n2 < n3) {
			System.out.println(" a ordem crescente é " + n1+"-" + n2+"-" + n3);
		}
		else if (n2 < n1 && n1 < n3) {
			
			System.out.println("a ordem crescente é " + n2+"-" + n1+"-" + n3);
		}else if ( n3 < n2 && n2 < n1) {
			System.out.println("a ordem crescente é " + n3 +"-" + n2+"-" + n1);
		}
		else {
			System.out.println("ta errado pai");
		}
		
	}

}
