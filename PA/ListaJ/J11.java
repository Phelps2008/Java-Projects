package ListaJ;

import java.util.Scanner;

public class J11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp,fat = 1;
		System.out.println("digite um numero");
		resp = sc.nextInt();
		
		while (resp > 1) {
			fat *= resp;
			resp--;
			System.out.println("seu numero em fatorial é :    " + fat);
			
		}
	}

}
