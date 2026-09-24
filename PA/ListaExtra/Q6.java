package ListaExtra;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double Carv, Ep1, Ep2, T1, Tp;
		
		System.out.println("Qual o total de carvão foi extraído?");
		Carv = leia.nextDouble();
		
		Ep1 = ((Carv * 0.02) - Carv);
		Ep2 = ((Ep1 * 0.03) - Ep1);
		
		
		
		
		System.out.println(("O total de carvão extraído foi: ") + Carv + (" A primeira perca foi de 2% ") + Ep1 + (" Contando com a última perca de mais 3% são: ") + Ep2);
 
	}

}
