package listaF;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota, nota2, nota3, nota4, reserva, total, recup ;
		
		System.out.println("Qual a sua nota do primeiro bimestre?");
		nota = leia.nextDouble();
		System.out.println("Qual a sua nota do primeiro bimestre?");
		nota2 = leia.nextDouble();
		System.out.println("Qual a sua nota do primeiro bimestre?");
		nota3 = leia.nextDouble();
		System.out.println("Qual a sua nota do primeiro bimestre?");
		nota4 = leia.nextDouble();

		total = ((nota + nota2 + nota3 + nota4 )/4);
		
		if(total >= 5) {
			System.out.println("Aprovado com média de: " + total);
		} else if(total < 5) {
			System.out.println("Qual a sua nota na prova de recuperação?");
			recup = leia.nextDouble();
			reserva = ((total + recup) /2);
			System.out.println("Aprovado com média de: " + reserva);
		} else{
			System.out.println("Reprovado com média de: " + total);
		}
	}
}	
		
	


