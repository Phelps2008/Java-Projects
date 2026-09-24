package ListaK;
import java.util.Scanner;

public class K4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		        int femSim = 0;
		        int femNao = 0;
		        int masSim = 0;
		        int masNao = 0;

		        String continuar;

		        do {
		            System.out.print("Digite o sexo (F/M): ");
		            String sexo = scanner.nextLine();
		            System.out.print("Gostou do produto? (S/N): ");
		            String resposta = scanner.nextLine();

		            if (sexo.equalsIgnoreCase("F")) {

		                if (resposta.equalsIgnoreCase("S")) {
		                    femSim++;
		                }
		                else if (resposta.equalsIgnoreCase("N")) {
		                    femNao++;
		                }
		                else {
		                    System.out.println("Resposta inválida!");
		                }

		            }

		            else if (sexo.equalsIgnoreCase("M")) {

		                if (resposta.equalsIgnoreCase("S")) {
		                    masSim++;
		                }
		                else if (resposta.equalsIgnoreCase("N")) {
		                    masNao++;
		                }
		                else {
		                    System.out.println("Resposta inválida!");
		                }

		            }

		            else {
		                System.out.println("Sexo inválido!");
		            }

		            System.out.print("Deseja continuar? (S/N): ");
		            continuar = scanner.nextLine();

		        } while (continuar.equalsIgnoreCase("S"));

		        int totalFem = femSim + femNao;
		        int totalMas = masSim + masNao;

		        double porcentFemNao = 0;
		        double porcentMasSim = 0;

		        if (totalFem > 0) {
		            porcentFemNao = (double) femNao * 100 / totalFem;
		        }

		        if (totalMas > 0) {
		            porcentMasSim = (double) masSim * 100 / totalMas;
		        }
		        System.out.println("\n===== RESULTADOS =====");
		        System.out.println("Mulheres que gostaram: " + femSim);
		        System.out.println("Mulheres que não gostaram: " + femNao);
		        System.out.println("Homens que gostaram: " + masSim);
		        System.out.println("Homens que não gostaram: " + masNao);
		        System.out.printf("Porcentagem de mulheres que não gostaram: %.1f%%\n", porcentFemNao);
		        System.out.printf("Porcentagem de homens que gostaram: %.1f%%\n", porcentMasSim);
		        scanner.close();
		    }
		}