package ListaJ;

import java.util.Scanner;

public class J7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix = 0, lotr = 0;
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("1-Matrix | 2-Senhor dos Aneis: ");
            int voto = sc.nextInt();

            matrix += (voto == 1) ? 1 : 0;
            lotr += (voto == 2) ? 1 : 0;

            System.out.print("Continuar? ");
            resp = sc.next();
        }

        if (matrix > lotr)
            System.out.println("Vencedor: Matrix");
        else if (lotr > matrix)
            System.out.println("Vencedor: Senhor dos Aneis");
        else
            System.out.println("Empate");

        System.out.println("Matrix: " + matrix);
        System.out.println("LOTR: " + lotr);

        sc.close();
    }
}