package ListaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		
		System.out.println("Informe seu código de acesso:");
		cod = sc.nextInt();
		
		switch(cod) {
		case 10:
			System.out.println("Departamento de Expedição");
		break;
		case 20:
			System.out.println("Departamento de RH (Recursos Humanos)");
			break;
		case 30:
			System.out.println("Departamneto de Logística");
			break;
		case 40:
			System.out.println("Departamento de Contabilidade");
			break;
		case 50:
			System.out.println("Departamento Pessoal");
			break;
		case 60:
			System.out.println("Departamento de Informática");
			break;
		default:
			System.out.println("*ERRO: Código Inválido.");
		}

	}

}
