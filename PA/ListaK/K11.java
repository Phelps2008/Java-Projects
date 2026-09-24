package ListaK;
import java.util.Scanner;
public class K11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = sc.nextInt();
		        
		int fatorial = 1;
		int i = numero;

		if (numero < 0) {
			System.out.println("Erro: Não existe fatorial de número negativo.");
		        } 
		else if (numero == 0) {
			System.out.println("O fatorial de 0 é 1.");
		        } 
		else {
		   do {
			   fatorial = fatorial * i;
			   i--;
		            } 
		   while (i > 0);
		   System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
  }
}