package listaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double cod;
		System.out.println("Informe seu código:");
		cod = leia.nextDouble();
		
		if(cod == 10) {
			System.out.println("Seu departamento é de COTABILIDADE!");
		}else if(cod == 12) {
			System.out.println("Seu departamento é de ALMOXARIFADO!");
		} else if(cod == 14) {
			System.out.println("Seu departamento é de IFORMÁTICA!");
		}else {
			System.out.println("Informe o código correto.");
		}
	}
}