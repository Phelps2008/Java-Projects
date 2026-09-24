package ListaJ;

import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, med = 0, admMasc = 0, medFem = 0;
        int engMasc = 0, psiFem = 0, totalMasc = 0;

        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Curso (1-Eng, 2-Adm, 3-Med, 4-Psi): ");
            int curso = sc.nextInt();

            total++;

            engMasc += (sexo == 'M' && curso == 1) ? 1 : 0;
            psiFem += (sexo == 'F' && curso == 4) ? 1 : 0;
            med += (curso == 3) ? 1 : 0;
            admMasc += (sexo == 'M' && curso == 2) ? 1 : 0;
            medFem += (sexo == 'F' && curso == 3) ? 1 : 0;
            totalMasc += (sexo == 'M') ? 1 : 0;

            System.out.print("Continuar? (S/N): ");
            resp = sc.next();
        }

        System.out.println("Homens em Engenharia: " + engMasc);
        System.out.println("Mulheres em Psicologia: " + psiFem);
        System.out.println("Percentual Medicina: " + (med * 100.0 / total) + "%");
        System.out.println("Percentual homens em Adm: " + (admMasc * 100.0 / totalMasc) + "%");
        System.out.println("Percentual mulheres em Medicina: " + (medFem * 100.0 / total) + "%");

        sc.close();
    }
}
