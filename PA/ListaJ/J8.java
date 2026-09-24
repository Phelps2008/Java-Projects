package ListaJ;

import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fujiro = 0, takaro = 0;
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("1-Fujiro | 2-Takaro: ");
            int voto = sc.nextInt();

            fujiro += (voto == 1) ? 1 : 0;
            takaro += (voto == 2) ? 1 : 0;

            System.out.print("Continuar? ");
            resp = sc.next();
        }

        if (fujiro == takaro) {
            System.out.println("Empate! Voto de desempate:");
            int voto = sc.nextInt();
            fujiro += (voto == 1) ? 1 : 0;
            takaro += (voto == 2) ? 1 : 0;
        }

        int total = fujiro + takaro;

        System.out.println("Fujiro: " + fujiro + " (" + (fujiro * 100.0 / total) + "%)");
        System.out.println("Takaro: " + takaro + " (" + (takaro * 100.0 / total) + "%)");

        sc.close();
    }
}