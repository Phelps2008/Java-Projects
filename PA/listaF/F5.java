package listaF;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double cod, salA, salP, dif;
		System.out.println("qual seu cód ?");
		cod = leia.nextDouble();
		
		System.out.println("quanto de bunfunfa?");
		salA = leia.nextDouble();
		
		if(cod ==1) {
			dif = ((salA /100 )*5);
			salP = (dif + salA );
			System.out.println("se ganha "+ salP);
		}
		if(cod ==2) {
			dif = ((salA / 100 )*10);
			salP = (dif + salA );
			System.out.println("se ganha "+ salP);
		}
		if(cod ==3) {
			dif = ((salA / 100 )*15);
			salP = (dif + salA );
			System.out.println("se ganha "+ salP);
		}
		if(cod ==4) {
			dif = ((salA /  100 )*20);
			salP = (dif + salA );
			System.out.println("se ganha "+ salP);
		}
		if(cod ==5) {
			dif = ((salA /  100 )*25);
			salP = (dif + salA );
			System.out.println("se ganha "+ salP);
		}
		if(cod ==6) {
			dif = ((salA / 100 )*30);
			salP = (dif + salA );
	System.out.println("se ganha "+ salP);
		}
	}
}