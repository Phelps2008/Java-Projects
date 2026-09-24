package ListaJ;
import java.util.Scanner;

public class J5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int sim = 0, nao = 0;
	        int femSim = 0, mascNao = 0;
	        int totalFem = 0, totalMasc = 0;

	        String resp = "S";

	        while (resp.equalsIgnoreCase("S")) {
	            System.out.print("Sexo (M/F): ");
	            char sexo = sc.next().toUpperCase().charAt(0);

	            System.out.print("Resposta (S/N): ");
	            char resposta = sc.next().toUpperCase().charAt(0);

	            sim += (resposta == 'S') ? 1 : 0;
	            nao += (resposta == 'N') ? 1 : 0;

	            femSim += (sexo == 'F' && resposta == 'S') ? 1 : 0;
	            mascNao += (sexo == 'M' && resposta == 'N') ? 1 : 0;

	            totalFem += (sexo == 'F') ? 1 : 0;
	            totalMasc += (sexo == 'M') ? 1 : 0;

	            System.out.print("Continuar? (S/N): ");
	        }
	    }
}
