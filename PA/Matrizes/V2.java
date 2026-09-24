package Matrizes;
import java.util.Iterator;
import java.util.Scanner;
	public class V2 {
		public static void main(String[] args) {
			String alunos[][] = new String[3][4];
			Scanner sc = new Scanner(System.in);
	
			for (int linha = 0; linha <= 2; linha++) {
				for (int coluna = 0; coluna <= 3; coluna++) {
					System.out.println("Informe o nome do aluno:");
					alunos[linha][coluna] = sc.nextLine();
				}
			}
	
			for (int linha = 0; linha <= 2; linha++) {
				for (int coluna = 0; coluna <= 3; coluna++) {
					System.out.print(alunos[linha][coluna] + "   ");
				}
				System.out.println();
			}
		}
	}