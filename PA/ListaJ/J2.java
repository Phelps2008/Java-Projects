package ListaJ;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num;
	
	System.out.println("Digite um número:");
	num = sc.nextInt();
	
	while((num >= 1) && (num <= 999999999)) {
		num--;
		
	if (num % 2 == 0) {
		System.out.println("Número Par: " + num);
		}
		else {
			System.out.println("Número Impar: " + num);
	  }
	}
  }
}
