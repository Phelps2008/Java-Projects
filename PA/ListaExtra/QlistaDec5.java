/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade
mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média =
quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.*/
package ListaExtra;

import java.util.Scanner;

public class QlistaDec5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			double max,min,med,estoq;
			
			System.out.println("quanto você tem dentro do seu estoque atualmente?");
			estoq = leia.nextDouble();
			
			System.out.println("Qual a capacidade maxima do estoque?");
			max = leia.nextDouble();
			
			System.out.println("Qual a capacidade minima do estoque?");
			min = leia.nextDouble();
			
			med = ((max + min)/2 );
			
			if(med < estoq){
				System.out.println("não é nescessario comprar mais produtos para o estoque");
			}
			else if (med== estoq) {
				System.out.println("A capacidade média e a quantidade de produtos em estoque estão em igualdade, a escolha é sua de comprar ou não");
			}
			else {
				System.out.println("você está com uma baixa quantidade de produtos em estoque");
			}
	}

}
