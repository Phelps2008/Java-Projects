package ListaK;
import java.util.Scanner;
public class K9 {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);
		        int porshe = 0, ferrari = 0, mercedes = 0;
		        int totalvts = 0, vts;
		        String resp = "S";

		        while (resp.equalsIgnoreCase("S")) {
		            // Correção do caractere de escape: \n
		            System.out.println("Qual o carro que você escolheria?\nFerrari (1)\nMercedes (2)\nPorshe (3)");
		            vts = sc.nextInt();

		            if (vts == 1) {
		                ferrari++;
		                totalvts++;
		            } else if (vts == 2) {
		                mercedes++;
		                totalvts++;
		            } else if (vts == 3) {
		                porshe++;
		                totalvts++;
		            } else {
		                System.out.println("Código está errado");
		            }

		            System.out.println("Deseja continuar? (S/N)");
		            resp = sc.next();
		        }

		        if (totalvts > 0) {
		            // Cálculo de porcentagem (adicionado (double) para evitar divisão inteira)
		            double pporshe = (porshe * 100.0) / totalvts;
		            double pferrari = (ferrari * 100.0) / totalvts;
		            double pmercedes = (mercedes * 100.0) / totalvts;

		            // Lógica de verificação de vencedor
		            if (ferrari > mercedes && ferrari > porshe) {
		                System.out.println("Ferrari é a preferência do público.\nGanha com o percentual de " + pferrari + "%");
		                if (mercedes == porshe) System.out.println("Houve um empate entre Porshe e Mercedes pelo segundo lugar.");
		            } 
		            else if (mercedes > ferrari && mercedes > porshe) {
		                System.out.println("O público prefere Mercedes em sua maioria.\nMercedes ganha com o percentual de " + pmercedes + "%");
		                if (ferrari == porshe) System.out.println("Houve um empate entre Porshe e Ferrari pelo segundo lugar.");
		            } 
		            else if (porshe > ferrari && porshe > mercedes) {
		                System.out.println("O público prefere Porshe em sua maioria.\nPorshe ganha com o percentual de " + pporshe + "%");
		                if (ferrari == mercedes) System.out.println("Houve um empate entre Mercedes e Ferrari pelo segundo lugar.");
		            } 
		            else if (ferrari == mercedes && mercedes == porshe) {
		                System.out.println("Empate triplo entre Ferrari, Mercedes e Porshe!");
		            } 
		            else {
		                System.out.println("Houve um empate entre dois líderes.");
		            }
		        } else {
		            System.out.println("Nenhum voto registrado.");
		        }
		        
		        sc.close();
		    }
		}

	


