/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */
package ListaExtra;

import java.util.Scanner;

public class QlistaDec4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double saldo,credito,debito,atual;
		System.out.println("Quanto de crédito você tem na conta ?");
		credito = leia.nextDouble();
		
		System.out.println("Quanto você gastou hoje ?");
		debito = leia.nextDouble();
		
		saldo = (credito - debito);
		
		if(saldo >=0) {
			System.out.println("Saldo ainda é positivo, você contém o total de " + saldo );
			
		}
		else {
			System.out.println("sai daqui seu liso, você tem o total de " + saldo);
		}
	}

}
