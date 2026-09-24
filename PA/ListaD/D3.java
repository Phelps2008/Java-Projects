package ListaD;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("Qual é o seu código de departamento?");
		num = leia.nextInt();
		
		if (num == 1) {
			System.out.println("Seu setor é o departamento de expedição.");
		}
		if (num == 2) {
			System.out.println("Seu setor é o departamento de RH.");
		}
		if (num == 3) {
			System.out.println("Seu setor é o departamento de Logística.");
		}
		if (num == 4) {
			System.out.println("Seu setor é o departamento de Contabilidade.");
		}
	}

}
