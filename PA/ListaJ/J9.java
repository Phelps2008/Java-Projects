package ListaJ;

import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cc = 0, dir = 0, let = 0;
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("1-CC 2-Direito 3-Letras: ");
            int voto = sc.nextInt();

            cc += (voto == 1) ? 1 : 0;
            dir += (voto == 2) ? 1 : 0;
            let += (voto == 3) ? 1 : 0;

            resp = sc.next();
        }

        int total = cc + dir + let;

        System.out.println("CC: " + cc + " (" + (cc * 100.0 / total) + "%)");
        System.out.println("Direito: " + dir + " (" + (dir * 100.0 / total) + "%)");
        System.out.println("Letras: " + let + " (" + (let * 100.0 / total) + "%)");

        sc.close();
    }
}