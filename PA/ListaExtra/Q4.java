package ListaExtra;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double  CF, Id, I, TT, VC;  
		
		System.out.println("Valor do carro:");
		VC = leia.nextDouble();
	
		Id = (VC * 0.28);
		I = (VC * 0.45);
		TT = (Id + I + VC);
		
		System.out.println(("O valor total do carro com todos os impostos incluso é: ") + TT + ("."));
		
				
	}

}
