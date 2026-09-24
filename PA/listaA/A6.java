package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double HT, VH, PD, SB, TD, SL;
		System.out.println("Informe as horas trabalhadas: ");
		HT = leia.nextDouble();
		
		System.out.println("Informe o valor por hora trabalhada: ");
		VH = leia.nextDouble();
		
		SB = (HT * VH);
		
		System.out.println("Informe o porcentual de desconto: ");
		PD = leia.nextDouble();
		
		TD = ((PD / 100) * SB);
		SL = (SB - TD);
		
		System.out.println(("Seu valor no Salário bruto é: ") + SB + ".\n" + (" E seu salário liquído é: ") + SL + ".\n" + (" Pois você tem um desconto de: ") + TD + ("."));

	}

}
