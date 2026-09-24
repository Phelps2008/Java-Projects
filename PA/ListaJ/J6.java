package ListaJ;
import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, homensCentro = 0, mulheresSul = 0;
        int homensMenorLeste = 0;

        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Região (C/L/N/O/S): ");
            char reg = sc.next().toUpperCase().charAt(0);

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            total++;

            homensCentro += (sexo == 'M' && reg == 'C') ? 1 : 0;
            mulheresSul += (sexo == 'F' && reg == 'S' && idade >= 18) ? 1 : 0;
            homensMenorLeste += (sexo == 'M' && reg == 'L' && idade < 18) ? 1 : 0;

            System.out.print("Continuar? ");
            resp = sc.next();
        }

        System.out.println("Homens menores na Leste: " + homensMenorLeste);
        System.out.println("Percentual mulheres adultas Sul: " + (mulheresSul * 100.0 / total) + "%");
        System.out.println("Percentual homens Centro: " + (homensCentro * 100.0 / total) + "%");
        System.out.println("Total pessoas: " + total);

        sc.close();
    }
}