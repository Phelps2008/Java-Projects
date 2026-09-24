package ListaI;
import java.util.Scanner;
public class Icompleta {

	public static void main(String[] args) {
		

		        Scanner leia = new Scanner(System.in);

		        // ================= I1 =================
		        System.out.println("\n===== I1 =====");

		        for (int i = 1; i <= 100; i++) {
		            System.out.println(i);
		        }

		        for (int i = 100; i >= 1; i--) {
		            System.out.println(i);
		        }

		        // ================= I2 =================
		        System.out.println("\n===== I2 =====");

		        for (char letra = 'a'; letra <= 'z'; letra++) {
		            System.out.println(letra);
		        }

		        for (char letra = 'z'; letra >= 'a'; letra--) {
		            System.out.println(letra);
		        }

		        // ================= I3 =================
		        System.out.println("\n===== I3 =====");

		        for (int i = 1; i <= 10; i++) {
		            System.out.println("5 x " + i + " = " + (5 * i));
		        }

		        // ================= I4 =================
		        System.out.println("\n===== I4 =====");

		        System.out.print("Digite um número: ");
		        int numero = leia.nextInt();

		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }

		        // ================= I5 =================
		        System.out.println("\n===== I5 =====");

		        for (int aluno = 1; aluno <= 10; aluno++) {

		            double soma = 0;

		            for (int nota = 1; nota <= 4; nota++) {

		                System.out.print("Digite a nota " + nota + " do aluno " + aluno + ": ");
		                soma += leia.nextDouble();
		            }

		            double media = soma / 4;

		            System.out.println("Média do aluno " + aluno + ": " + media);
		        }

		        // ================= I6 =================
		        System.out.println("\n===== I6 =====");

		        int aprovados = 0;

		        for (int i = 1; i <= 20; i++) {

		            System.out.print("Digite a média do aluno " + i + ": ");
		            double media = leia.nextDouble();

		            if (media >= 6) {
		                aprovados++;
		            }
		        }

		        System.out.println("Total de aprovados: " + aprovados);

		        // ================= I7 =================
		        System.out.println("\n===== I7 =====");

		        System.out.print("Quantidade de alunos: ");
		        int quantidade = leia.nextInt();

		        int somaIdades = 0;

		        for (int i = 1; i <= quantidade; i++) {

		            System.out.print("Digite a idade do aluno " + i + ": ");
		            int idade = leia.nextInt();

		            somaIdades += idade;
		        }

		        double mediaIdades = (double) somaIdades / quantidade;

		        System.out.println("Média das idades: " + mediaIdades);

		        // ================= I8 =================
		        System.out.println("\n===== I8 =====");

		        System.out.print("Quantidade de funcionários: ");
		        int qtd = leia.nextInt();

		        for (int i = 1; i <= qtd; i++) {

		            System.out.print("Código do funcionário: ");
		            int codigo = leia.nextInt();

		            System.out.print("Salário atual: ");
		            double salario = leia.nextDouble();

		            double percentual = 0;

		            switch (codigo) {

		                case 1:
		                    percentual = 0.05;
		                    break;

		                case 2:
		                    percentual = 0.15;
		                    break;

		                case 3:
		                    percentual = 0.25;
		                    break;

		                case 4:
		                    percentual = 0.30;
		                    break;

		                default:
		                    System.out.println("Código inválido!");
		            }

		            double reajuste = salario * percentual;
		            double novoSalario = salario + reajuste;

		            System.out.println("Salário antigo: " + salario);
		            System.out.println("Reajuste: " + reajuste);
		            System.out.println("Novo salário: " + novoSalario);
		        }

		        // ================= I9 =================
		        System.out.println("\n===== I9 =====");

		        int votosMatrix = 0;
		        int votosSDA = 0;

		        for (int i = 1; i <= 20; i++) {

		            System.out.println("Pessoa " + i);
		            System.out.println("1 - Matrix");
		            System.out.println("2 - Senhor dos Anéis");

		            int voto = leia.nextInt();

		            if (voto == 1) {
		                votosMatrix++;
		            } else if (voto == 2) {
		                votosSDA++;
		            } else {
		                System.out.println("Voto inválido!");
		            }
		        }

		        System.out.println("Votos Matrix: " + votosMatrix);
		        System.out.println("Votos Senhor dos Anéis: " + votosSDA);

		        if (votosMatrix > votosSDA) {
		            System.out.println("Matrix venceu!");
		        } else if (votosSDA > votosMatrix) {
		            System.out.println("Senhor dos Anéis venceu!");
		        } else {
		            System.out.println("Empate!");
		        }

		        // ================= I10 =================
		        System.out.println("\n===== I10 =====");

		        System.out.print("Quantos números deseja digitar? ");
		        int qtdNumeros = leia.nextInt();

		        int maior = 0;
		        int menor = 0;

		        for (int i = 1; i <= qtdNumeros; i++) {

		            System.out.print("Digite um número: ");
		            int num = leia.nextInt();

		            if (i == 1) {
		                maior = num;
		                menor = num;
		            }

		            if (num > maior) {
		                maior = num;
		            }

		            if (num < menor) {
		                menor = num;
		            }
		        }

		        System.out.println("Maior número: " + maior);
		        System.out.println("Menor número: " + menor);

		        // ================= I11 =================
		        System.out.println("\n===== I11 =====");

		        int soma = 0;

		        System.out.print("Soma: ");

		        for (int i = 1; i <= 100; i++) {

		            soma += i;

		            System.out.print(i);

		            if (i < 100) {
		                System.out.print(" + ");
		            }
		        }

		        System.out.println(" = " + soma);

		        // ================= I12 =================
		        System.out.println("\n===== I12 =====");

		        for (int i = 0; i <= 50; i++) {

		            if (i % 2 != 0) {
		                System.out.println("Número ímpar: " + i);
		            }
		        }

		        // ================= I13 =================
		        System.out.println("\n===== I13 =====");

		        int somaImpares = 0;
		        long multPares = 1;

		        System.out.print("Soma dos ímpares: ");

		        for (int i = 1; i <= 20; i++) {

		            if (i % 2 != 0) {

		                somaImpares += i;

		                System.out.print(i);

		                if (i < 19) {
		                    System.out.print(" + ");
		                }
		            }
		        }

		        System.out.println(" = " + somaImpares);

		        System.out.print("Multiplicação dos pares: ");

		        for (int i = 1; i <= 20; i++) {

		            if (i % 2 == 0) {

		                multPares *= i;

		                System.out.print(i);

		                if (i < 20) {
		                    System.out.print(" x ");
		                }
		            }
		        }

		        System.out.println(" = " + multPares);

		        // ================= I14 =================
		        System.out.println("\n===== I14 =====");

		        System.out.print("Digite um número: ");
		        int numeroFat = leia.nextInt();

		        int fatorial = 1;

		        System.out.print(numeroFat + "! = ");

		        for (int i = numeroFat; i >= 1; i--) {

		            fatorial *= i;

		            System.out.print(i);

		            if (i > 1) {
		                System.out.print(" x ");
		            }
		        }

		        System.out.println(" = " + fatorial);

		        // ================= I15 =================
		        System.out.println("\n===== I15 =====");

		        System.out.print("Digite a base: ");
		        int base = leia.nextInt();

		        System.out.print("Digite o expoente: ");
		        int expoente = leia.nextInt();

		        int resultado = 1;

		        System.out.print(base + "^" + expoente + " = ");

		        for (int i = 1; i <= expoente; i++) {

		            resultado *= base;

		            System.out.print(base);

		            if (i < expoente) {
		                System.out.print(" x ");
		            }
		        }

		        System.out.println(" = " + resultado);

		        leia.close();
		    }
		}