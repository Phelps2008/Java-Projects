package ListaK;
import java.util.Scanner;
public class K6 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);

		        String voto;
		        String resp = "S";

		        int matrix = 0;
		        int senhorAneis = 0;

		        System.out.println("OPCOES: Matrix (M) / Senhor dos Anéis (A)");
		        System.out.println("RESP: S para continuar / N para parar");

		        while(resp.equalsIgnoreCase("S")) {

		            System.out.print("\nQual a melhor saga? ");
		            voto = x.nextLine();

		            if(voto.equalsIgnoreCase("M")) {
		                matrix++;
		            } else {

		                if(voto.equalsIgnoreCase("S") || voto.equalsIgnoreCase("A")) {
		                    senhorAneis++;
		                }

		            }

		            System.out.print("Continuar? (S/N): ");
		            resp = x.nextLine();

		        }

		        System.out.println("\nRESULTADO FINAL");

		        System.out.println("Matrix: " + matrix);
		        System.out.println("Senhor dos Anéis: " + senhorAneis);

		        if(matrix > senhorAneis) {
		            System.out.println("Vencedor: Matrix");
		        } else {

		            if(senhorAneis > matrix) {
		                System.out.println("Vencedor: Senhor dos Anéis");
		            } else {
		                System.out.println("Empate");
		            }

		        }

	}

}
