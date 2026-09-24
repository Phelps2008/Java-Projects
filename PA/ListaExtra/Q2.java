package ListaExtra;

import java.util.Scanner;

public class Q2 {

	
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        double validos, invalidos, percValidos, percInvalidos, VB, N, TTE;

	        System.out.println("Total de eleitores:");
	        TTE = leia.nextDouble();

	        System.out.println("Votos brancos:");
	        VB = leia.nextDouble();

	        System.out.println("Votos nulos:");
	        N = leia.nextDouble();

	        invalidos = VB + N;
	        validos = TTE - invalidos;

	        percInvalidos = (invalidos / TTE) * 100;
	        percValidos = (validos / TTE) * 100;

	        System.out.println("Votos válidos: " + percValidos + "%");
	        System.out.println("Votos inválidos (brancos + nulos): " + percInvalidos + "%");
	    }
	
}
