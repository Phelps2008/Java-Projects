package Desafio;
import java.util.Random;
import java.util.Scanner;
public class LoteriaV2 {

	public static void main(String[] args) {
		int dezenasSorteadas[] = new int[6];
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i < dezenasSorteadas.length; i++) {
            int numeroGerado;
            boolean repetido;

            do {
                numeroGerado = random.nextInt(60) + 1; // Gera de 1 a 60
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (dezenasSorteadas[j] == numeroGerado) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            
            dezenasSorteadas[i] = numeroGerado;
        }
		System.out.print("Dezenas Sorteadas: ");
	        for (int i = 0; i < dezenasSorteadas.length; i++) {
	            System.out.print(dezenasSorteadas[i] + " ");
	        }
	        System.out.println("\n-------------------------------------------");
	        int quantAp;
	        System.out.println("Quantos apostadores?");
	        quantAp = sc.nextInt();
	        System.out.println("-------------------------------------------");
	        int apostas[][] = new int[quantAp][6];
	        for(int linha = 0; linha < quantAp; linha++) {
	        	for(int coluna = 0; coluna <= 5 ; coluna++) {
	        		System.out.println("Qual o seu número desejado de 1 a 60? Apostador " + (linha+1));
	        		apostas[linha][coluna] = sc.nextInt();
	        }	
	}
	        System.out.println("-------------------------------------------");
	        for (int i = 0; i < apostas.length - 1; i++) {
	            for (int j = 0; j < apostas.length - 1 - i; j++) {
	                
	                if (apostas[i][j] > apostas[i][j + 1]) {
	                    int aux = apostas[i][j];
	                    apostas[j] = apostas[j + 1];
	                    apostas[i][j + 1] = aux;
	                }
	            }
	        }
	        System.out.print("[");
	        for (int i = 0; i < apostas.length; i++) {
	        	for(int j = 0; j < apostas.length; j++) {
	        		System.out.print(apostas[i][j]);
		            if (i < apostas.length - 1 && j < apostas.length -1) {
		                System.out.print(", ");
	        	}
	          }
	        }
	        System.out.println("]");
	        System.out.println("-------------------------------------------");
 }
}