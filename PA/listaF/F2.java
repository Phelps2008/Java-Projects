package listaF;

import java.util.Scanner;

public class F2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double id;
		System.out.println("Informe a idade do atleta:");
		id = leia.nextDouble();
		
		if(id >= 6 && id <= 8) {
			System.out.println("Sua categoria é: DENTE-DE-LEITE");
		}else if(id >= 9 && id <= 11){
			System.out.println("Sua categoria é: PRÉ-MIRIM");
		}else if(id == 12 || id == 13){
			System.out.println("Sua categoria é: MIRIM");
		}else if(id == 14 || id == 15){
			System.out.println("Sua categoria é: INFANTIL");
		}else if(id == 16 || id == 17){
			System.out.println("Sua categoria é: JUVENIL");
		}else if(id >= 18 && id <= 20){
			System.out.println("Sua categoria é: JUNIORS");
		}else {
			System.out.println("Informe a idade correta!");
		}

	}

}
