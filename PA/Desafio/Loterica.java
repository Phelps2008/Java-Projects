package Desafio;
import java.util.Random;
public class Loterica {

	public static void main(String[] args) {
		int dezenasSorteadas[] = new int[6];
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
	        int totalApostadores = 5;
	        for (int ap = 1; ap <= totalApostadores; ap++) {
	            int palpitesApostador[] = new int[6];
	            for (int i = 0; i < palpitesApostador.length; i++) {
	                int palpiteGerado;
	                boolean repetido;
	                do {
	                    palpiteGerado = random.nextInt(60) + 1;
	                    repetido = false;
	                    for (int j = 0; j < i; j++) {
	                        if (palpitesApostador[j] == palpiteGerado) {
	                            repetido = true;
	                            break;
	                        }
	                    }
	                } while (repetido);
	                palpitesApostador[i] = palpiteGerado;
	            }
	            int acertos = 0;
	            for (int i = 0; i < palpitesApostador.length; i++) {
	                for (int j = 0; j < dezenasSorteadas.length; j++) {
	                    if (palpitesApostador[i] == dezenasSorteadas[j]) {
	                        acertos++;
	          }}}
	            System.out.print("Apostador " + ap + " - Palpites: ");
	            for (int i = 0; i < palpitesApostador.length; i++) {
	                System.out.print(palpitesApostador[i] + " ");
	            }
	            System.out.println(" | Acertos: " + acertos);
  }
 }
}