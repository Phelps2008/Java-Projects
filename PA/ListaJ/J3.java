package ListaJ;

import java.util.Scanner;

public class J3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int sim = 0, nao = 0;
	        int femSim = 0, mascNao = 0;
	        int totalFem = 0, totalMasc = 0;

	        String resp = "S";

	        while (resp.equalsIgnoreCase("S")) {
	            System.out.print("Sexo (M/F): ");
	            char sexo = sc.next().toUpperCase().charAt(0);

	            System.out.print("Gostou do produto? (S/N): ");
	            char resposta = sc.next().toUpperCase().charAt(0);

	            if (resposta == 'S') {
	                sim++;
	                if (sexo == 'F') {
	                    femSim++;
	                }
	            } else if (resposta == 'N') {
	                nao++;
	                if (sexo == 'M') {
	                    mascNao++;
	                }
	            }

	            if (sexo == 'F') {
	                totalFem++;
	            } else if (sexo == 'M') {
	                totalMasc++;
	            }

	            System.out.print("Deseja continuar? (S/N): ");
	            resp = sc.next();
	        }

	        double percFemSim = (totalFem > 0) ? (femSim * 100.0 / totalFem) : 0;
	        double percMascNao = (totalMasc > 0) ? (mascNao * 100.0 / totalMasc) : 0;

	        System.out.println("\nRESULTADOS:");
	        System.out.println("Total de SIM: " + sim);
	        System.out.println("Total de NÃO: " + nao);
	        System.out.println("Porcentagem de mulheres que responderam SIM: " + percFemSim + "%");
	        System.out.println("Porcentagem de homens que responderam NÃO: " + percMascNao + "%");

	        sc.close();
	    }
	}
