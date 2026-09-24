package ListaD;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double cod, porcent, salarioV, salarioN;
		
		System.out.println("Informe seu código:");
		cod = leia.nextDouble();
		System.out.println("Informe seu Salario Atual:");
		salarioV = leia.nextDouble();
		
		if(cod == 1) {
			salarioN = ((salarioV/100)*5 + salarioV);
			System.out.println("Sua função é OPERADOR. Seu salario antigo era de: " + salarioV + " Agora houve um reajuste de 5%, ficando: " + salarioN);
		} else if(cod == 2) {
			salarioN = ((salarioV/100)*10 + salarioV);
			System.out.println("Sua função é PROGRAMADOR. Seu salario antigo era de: " + salarioV + " Agora houve um reajuste de 10%, ficando: " + salarioN);
		} else if(cod == 3) {
			salarioN = ((salarioV/100)*15 + salarioV);
			System.out.println("Sua função é ANALISTA. Seu salario antigo era de: " + salarioV + " Agora houve um reajuste de 15%, ficando: " + salarioN);
		} else {
			System.out.println("Informe o código correto!");
		}

	}

}
