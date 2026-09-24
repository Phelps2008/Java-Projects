package ListaJ;
import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int corsa = 0, palio = 0, gol = 0;
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("1-Corsa 2-Palio 3-Gol: ");
            int voto = sc.nextInt();

            corsa += (voto == 1) ? 1 : 0;
            palio += (voto == 2) ? 1 : 0;
            gol += (voto == 3) ? 1 : 0;

            resp = sc.next();
        }

        int total = corsa + palio + gol;

        System.out.println("Corsa: " + corsa);
        System.out.println("Palio: " + palio);
        System.out.println("Gol: " + gol);

        sc.close();
    }
}