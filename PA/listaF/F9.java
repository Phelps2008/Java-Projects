package listaF;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num; 

		System.out.println("qual o numero");
		num= leia.nextInt();
		
		if( num %4 ==0 && num %5 == 0) {
			System.out.println("numero divisivel por 4 e 5");
		}else {
			System.out.println("esse numero pode não");
		}

	}

}
