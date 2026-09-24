/*Faça um programa para receber o valor unitário de um produto, e a quantidade adquirida pelo cliente. 
Se o cliente comprou mais de 10 itens, conceder um desconto de 10%, no valor total. Caso contrário o 
desconto será de 6%. Apresente: 
a) Valor total do produto sem o desconto. 
b) Valor final do produto com o desconto. 
c) Valor do desconto. 
d) Apresentar o total de produtos adquiridos. 
e) Exibir qual foi o percentual de desconto.*/

package ListaExtra;

import java.util.Scanner;
public class QlistaDec1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double VALTOTAL, VALFINAL, desc,prod, valdesc;
		
		System.out.println("quantos produtos voê pegou?");
		prod = leia.nextDouble();
		System.out.println("qual o valor ?");
		VALTOTAL = leia.nextDouble();
		
		if (prod >= 10){
		desc = ((VALTOTAL /100)*10 );
		valdesc = (VALTOTAL - desc);
		System.out.println("você ganhou o desconto de " +  desc + "(10%)  assim ficando com o valor final de " + valdesc );	
			
				
		}
		   if (prod <= 9) {
			desc = ((VALTOTAL /100)*6 );
			valdesc = (VALTOTAL - desc);
			System.out.println("você ganhou o desconto de " +  desc + "(6%)  assim ficando com o valor final de " + valdesc );
			
		}
	}
}