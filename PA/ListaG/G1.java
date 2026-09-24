package ListaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int cod;
	
	System.out.println("Digite um código de 1 a 5:");
	cod = sc.nextInt();
	
	switch (cod) {
	case 1:
		System.out.println("*ERRO: Identificador Inválido.");
	break;
    case 2:
		System.out.println("*ERRO: Esperando Número Inteiro.");
	break;
    case 3:
	    System.out.println("*ERRO: Tipo de Dado Indefinido.");
	break;
    case 4:
	   System.out.println("*ERRO: Parâmetro Incorreto.");
	break;
    case 5:
    	System.out.println("*ERRO: Memória Insuficiente.");
    break;
    default:
    	System.out.println("Ai não man");
    break;
	}
	

	}

}
