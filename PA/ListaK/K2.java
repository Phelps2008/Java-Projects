package ListaK;

import java.util.Scanner;

public class K2 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        int sim = 0, nao = 0;
	        int femNao = 0, mascSim = 0;
	        int totalFem = 0, totalMasc = 0;
	        int quant = 1;
	        String resp = "S";

	        while (resp.equalsIgnoreCase("S")) {
	            System.out.print("Sexo (M/F): ");
	            char sexo = sc.next().toUpperCase().charAt(0);

	            System.out.print("Gostou do produto? (S/N): ");
	            char resposta = sc.next().toUpperCase().charAt(0);

	            if (resposta == 'S') {
	                sim++;
	                if (sexo == 'M') {
	                    mascSim++;
	                }
	            } else if (resposta == 'N') {
	                nao++;
	                if (sexo == 'F') {
	                    femNao++;
	                }
	            }

	            if (sexo == 'F') {
	                totalFem++;
	            } else if (sexo == 'M') {
	                totalMasc++;
	            }

	            System.out.print("Deseja continuar? (S/N): ");
	            resp = sc.next();
	           
	            if(resp.equalsIgnoreCase("S")) {
	            	quant++;
	            }
	        }

	        double percFemNao = (totalFem > 0) ? (femNao * 100.0 / totalFem) : 0;
	        double percMascSim = (totalMasc > 0) ? (mascSim * 100.0 / totalMasc) : 0;

	        System.out.println("\nRESULTADOS:");
	        System.out.println("Total de SIM: " + sim);
	        System.out.println("Total de NÃO: " + nao);
	        System.out.println("Porcentagem de mulheres que responderam NÃO: " + percFemNao + "%");
	        System.out.println("Porcentagem de homens que responderam SIM: " + percMascSim + "%");
	        System.out.println("Pessoas entrevistadas: " + quant);
	}
}