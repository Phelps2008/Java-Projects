import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Fadm = 0, Madm = 0;
        double Fmed = 0, Mmed = 0;
        double Ftc = 0, Mtc = 0;
        double Fpisc = 0, Mpisc = 0;
        
        String resp = "S";

        while (resp.equalsIgnoreCase("S")) {
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("Qual o código do curso? (1-Eng. Comp / 2-Adm / 3-Med / 4-Psico): ");
            int curso = sc.nextInt();

            if (curso == 1) { // Engenharia da Computação
                if (sexo == 'M') Mtc++;
                else if (sexo == 'F') Ftc++;
            } 
            else if (curso == 2) { // Administração
                if (sexo == 'M') Madm++;
                else if (sexo == 'F') Fadm++;
            } 
            else if (curso == 3) { // Medicina
                if (sexo == 'M') Mmed++;
                else if (sexo == 'F') Fmed++;
            } 
            else if (curso == 4) { // Psicologia
                if (sexo == 'M') Mpisc++;
                else if (sexo == 'F') Fpisc++;
            }

            System.out.print("Deseja continuar? (S/N): ");
            resp = sc.next();
        }
        double totalEng = Mtc + Ftc;
        double totalPsico = Mpisc + Fpisc;
        double totalMedicina = Mmed + Fmed;
        
        double percHcp = (totalEng > 0) ? (Mtc / totalEng) * 100 : 0;
        double percMcp = (totalPsico > 0) ? (Fpisc / totalPsico) * 100 : 0;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Porcentagem de homens em Eng. da Computação: " + percHcp + "%");
        System.out.println("Porcentagem de mulheres em Psicologia: " + percMcp + "%");
        System.out.println("Total de mulheres em Administração: " + Fadm);
        System.out.println("Total de pessoas em Medicina: " + totalMedicina);
        sc.close();
    }
}