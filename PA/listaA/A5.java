package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double preco_produto, descont;
		
		
		System.out.println("fale o valor do produto");
		preco_produto = leia.nextDouble();
		
		descont = (preco_produto * -0.1 + preco_produto);
		
		System.out.println("o valor do prudoto a vista é de " + descont + " e o valor do produto total é de " + preco_produto);
		
		

	}

}
