package ListaK;
	import java.util.Scanner;
public class K10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		        int somaImpares = 0;
		        long multPares = 1;
		        int numero = 0;

		        while (numero <= 20) {

		            // 0 é par, mas pulamos (0 * qualquer = 0)
		            if (numero == 0) {
		                numero++;
		                continue;
		            }

		            // número ÍMPAR
		            else if (numero % 2 != 0) {
		                somaImpares += numero;
		            }

		            // número PAR
		            else {
		                multPares *= numero;
		            }

		            // avança pro próximo
		            numero++;
		        }

		        System.out.println("Soma dos ímpares (1 a 19): " + somaImpares);
		        System.out.println("Mult. dos pares (2 a 20): " + multPares);
		    }
		}