package ListaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod,sal,reaj,sala;

		System.out.println("qual o seu salario atual ?");
		sal = sc.nextInt();
		
		System.out.println("Informe seu código de acesso:");
		cod = sc.nextInt();
		switch (cod) {
		case 5:
			reaj = ((sal/100)*5);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 5%, e agora tem o valor novo de " + sala);
		break;
			
		case 1:
			reaj = ((sal/100)*5);
			sala = (reaj + sal);
			System.out.println("sua função é operador, seu salário teve um re-ajuste de 5%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 2:
			reaj = ((sal/100)*10);
			sala = (reaj + sal);
			System.out.println("sua função é programador, seu salário teve um re-ajuste de 10%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 3:
			reaj = ((sal/100)*15);
			sala = (reaj + sal);
			System.out.println("sua função é de analista, seu salário teve um re-ajuste de 15%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 4:
			reaj = ((sal/100)*25);
			sala = (reaj + sal);
			System.out.println("sua função é de gerenciamento, seu salário teve um re-ajuste de 25%, e agora tem o valor novo de " + sala);
			
			break;
	
			default: 
				System.out.println("QUER GANHAR MAIS QUE O PATRÃO?");
			break;
		}
	}


	}


