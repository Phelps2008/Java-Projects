package listaF;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota, nota2, nota3, nota4, recup, total, total2;
		
		System.out.println("Qual a nota do 1° bimestre?");
		nota = leia.nextDouble();
		System.out.println("Qual a nota do 2° bimestre?");
		nota2 = leia.nextDouble();
		System.out.println("Qual a nota do 3° bimestre?");
		nota3 = leia.nextDouble();
		System.out.println("Qual a nota do 4° bimestre?");
		nota4 = leia.nextDouble();
        
		total = ((nota + nota2 + nota3 + nota4) / 4);
		
		if(total >= 7) {
			System.out.println("Aprovado com média de: " + total);
		} else if(total == 5 && total == 6) {
			System.out.println("Qual a sua nota na prova de recuperação?");
			recup = leia.nextDouble();
			total2 = ((total + recup) /2);
			System.out.println("Aprovado com média de: " + total2);
		} else{
			System.out.println("Reprovado com média de: " + total);
		}
	}
}	