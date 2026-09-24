package ListaExtra;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double ANO, MES, DIA, CONT;
		
		System.out.println("Qual a sua idade");
		ANO = leia.nextDouble();
		
		 DIA = (ANO * 365 );
		 MES = ( DIA / 12);
			 
			 System.out.println(("Você viveu ") + ANO + (" anos, você viveu ") + MES + (" meses e também sobreviveu ") + DIA + (" dias."));
	}

}
