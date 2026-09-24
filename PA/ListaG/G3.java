package ListaG;

import java.util.Scanner;

public class G3 {

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
			
		case 15:
			reaj = ((sal/100)*10);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 10%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 20:
			reaj = ((sal/100)*15);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 15%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 25:
			reaj = ((sal/100)*20);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 20%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 30:
			reaj = ((sal/100)*25);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 25%, e agora tem o valor novo de " + sala);
			
			break;
			
		case 35:
			reaj = ((sal/100)*30);
			sala = (reaj + sal);
			System.out.println("seu salário teve um re-ajuste de 30%, e agora tem o valor novo de " + sala);
			
			break;
			default: 
				System.out.println("TU NÃO É DEV");
			break;
		}
	}

}
