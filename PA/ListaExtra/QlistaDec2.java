/*. Faça um programa para receber 2 notas escolares para cada um dos 4 bimestres.
Calcular a média de cada bimestre, o programa deverá ainda solicitar qual a nota de corte para a média.
Depois o programa deverá calcular a média final e apresentar juntamente com a mensagem
“APROVADO” ou "REPROVADO", de acordo com a relação da média do aluno x nota de corte.
*/
package ListaExtra;

import java.util.Scanner;

public class QlistaDec2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double med1, med2, med3, med4, med5, med6, med7, med8, mediafin, ntcorte, soma;
System.out.println("qual a nota de corte da sua escola?");
ntcorte = leia.nextDouble();

System.out.println("digite  sua 1° nota de prova/ trabalho");
med1 = leia.nextDouble();

System.out.println("digite  sua 2° nota de prova/ trabalho");
med2 = leia.nextDouble();

System.out.println("digite sua 3° nota de prova/ trabalho");
med3 = leia.nextDouble();

System.out.println("digite sua 4° nota de prova/ trabalho");
med4 = leia.nextDouble();

System.out.println("digite sua 5° nota de prova/ trabalho");
med5 = leia.nextDouble();

System.out.println("digite sua 6°  nota de prova/ trabalho");
med6 = leia.nextDouble();

System.out.println("digite sua 7° nota de prova/ trabalho");
med7 = leia.nextDouble();

System.out.println("digite sua 8° nota de prova/ trabalho");
med8 = leia.nextDouble();
        soma = ((med1 + med2 + med3 + med4 + med5 + med6 + med7 + med8)/8);
	
	if (soma >= ntcorte) {
		System.out.println("APROVADO com média de " + soma);
	}
	else {
		System.out.println("REPROVADO " + soma + " nota a baixo da nota de corte"); 
		}
	}
}
