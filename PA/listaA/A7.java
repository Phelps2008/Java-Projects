package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double distancia, temp, vel, lU;
		
		System.out.println("Quanto tempo durou a viagem");
		temp = leia.nextDouble();
				
		System.out.println("qual foi a velocidade media durante a viagem?");
		vel = leia.nextDouble();
		
		distancia = (temp * vel);
		lU = ( distancia / 12);
		
		System.out.println("Conforme suas informações, a velocidade média: " + vel + " o tempo da sua viagem foi de: " + temp + " sua distancia percorrida foi de: " + distancia + " e você gastou em média de combustível: " + lU + "L.");
		
		

	}

}
