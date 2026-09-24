package listaF;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double l1, l2, l3;
		System.out.println("qual o lado 1");
		l1 = leia.nextDouble();
		
		System.out.println("qual o lado 2");
		l2 = leia.nextDouble();
		
		System.out.println("qual o lado 3");
		l3 = leia.nextDouble();
		
		if ((l1 < l2 + l3) && (l2< l1 + l3)&& (l3 < l1 + l2)){
			
			System.out.println("triangulo");
			
			if (l1 == l2 && l1 ==  l3 && l2 == l3) {
				
				System.out.println("triangulo equilatero");
				
			}else if (l1 == l2 || l1 ==  l3 || l2 == l3) {
				
				System.out.println("triangulo isósceles");
			}
			else {
				System.out.println("escaleno");
			}
		
		}
		else {
			System.out.println("invalido");
		}
		
		}
	}


