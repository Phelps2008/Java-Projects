import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();

        double[] mediasFinais = new double[qtdAlunos];

        int aprovados = 0;
        int reprovados = 0;
        int aprovadosExame = 0;
        int reprovadosExame = 0;
        double somaMediasTurma = 0;

        for (int i = 0; i < qtdAlunos; i++) {
            double somaNotas = 0;

            System.out.println("\n--- Aluno " + (i + 1) + " ---");
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }

            double media = somaNotas / 4;

            if (media >= 6) {
                System.out.println("Status: Aprovado");
                mediasFinais[i] = media;
                aprovados++;
            } 
            else if (media < 5) {
                System.out.println("Status: Reprovado");
                mediasFinais[i] = media;
                reprovados++;
            } 
            else {
                System.out.println("Status: Em Exame");
                System.out.print("Digite a nota do exame: ");
                double notaExame = scanner.nextDouble();

                double novaMedia = (media + notaExame) / 2;
                mediasFinais[i] = novaMedia;

                if (novaMedia >= 5) {
                    System.out.println("Status: Aprovado em Exame");
                    aprovadosExame++;
                } else {
                    System.out.println("Status: Reprovado em Exame");
                    reprovadosExame++;
                }
            }
            somaMediasTurma += mediasFinais[i];
        }

        double mediaGeralTurma = somaMediasTurma / qtdAlunos;

        System.out.println("\n= RESULTADOS FINAIS =");
        System.out.println("Média geral da turma: " + mediaGeralTurma);
        System.out.println("Quantidade de alunos Aprovados: " + aprovados);
        System.out.println("Quantidade de alunos Reprovados: " + reprovados);
        System.out.println("Quantidade de alunos Aprovados em Exame: " + aprovadosExame);
        System.out.println("Quantidade de alunos Reprovados em Exame: " + reprovadosExame);

        scanner.close();
    }
}