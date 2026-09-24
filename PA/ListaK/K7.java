package ListaK;
import java.util.Scanner;
public class K7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vts;
		int empt;
		double vtR = 0, vtP = 0, totalVotos = 0;
		double porcentR, porcentP;
		String resp = "S";

		while (resp.equalsIgnoreCase("S")) {
			System.out.println("Candidatos: \n1 - Ricardo Teixeira \n2 - Paulo Falcão");
		    System.out.print("Digite seu voto: ");
		    vts = sc.nextInt();

		if (vts == 1) { 
		   vtR++;
		   totalVotos++;
		} else if (vts == 2) {
		  vtP++;
		  totalVotos++;
		} else {
		 System.out.println("Voto inválido!");
		}

		System.out.print("Deseja continuar? (S/N): ");
		resp = sc.next();
	}
		if (totalVotos > 0) {
		   porcentR = (vtR / totalVotos) * 100;
		   porcentP = (vtP / totalVotos) * 100;

		   if (vtR > vtP) {
			   System.out.println("Vencedor: Ricardo Teixeira com " + vtR + " votos (" + porcentR + "%)");
	} 
		   else if (vtP > vtR) {
			   System.out.println("Vencedor: Paulo Falcão com " + vtP + " votos (" + porcentP + "%)");
	} 
		   else {
			   System.out.println("Houve um empate! O voto de Minerva é necessário.");
			   System.out.println("Qual o seu voto de desempate? (1 ou 2)");
		       empt = sc.nextInt();

		       if (empt == 1) {
		    	   System.out.println("Vencedor: Ricardo Teixeira pelo voto de decisão.");
	} 		   else if (empt == 2) {
		          	System.out.println("Vencedor: Paulo Falcão pelo voto de decisão.");
	}
		       }
	} 	  else {
		  	System.out.println("Nenhum voto registrado.");
	}
  }
}
