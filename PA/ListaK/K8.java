package ListaK;
import java.util.Scanner;
public class K8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int med = 0, engE = 0, pisc = 0, vtsT = 0;
		int vts;
		String resp = "S";

		while (resp.equalsIgnoreCase("S")) {
		System.out.println("Qual curso você irá votar?\n1-Medicina\n2-Engenharia Elétrica\n3-Psicologia");
		vts = sc.nextInt();

		if (vts == 1) { med++; vtsT++; }
		else if (vts == 2) { engE++; vtsT++; }
		else if (vts == 3) { pisc++; vtsT++; }
		else { System.out.println("Opção inválida!"); }

		System.out.print("Deseja continuar? (S/N): ");
		resp = sc.next();
		        }

		if (vtsT > 0) {
		double pMed = (med * 100.0) / vtsT;
		double pEng = (engE * 100.0) / vtsT;
		double pPisc = (pisc * 100.0) / vtsT;

		if (med > engE && med > pisc) {
		System.out.println("Medicina venceu com " + pMed + "%.");
		if (engE == pisc) System.out.println("Empate em 2º entre Eng. Elétrica e Psicologia.");
		            } 
		else if (engE > med && engE > pisc) {
		System.out.println("Engenharia Elétrica venceu com " + pEng + "%.");
		if (med == pisc) System.out.println("Empate em 2º entre Medicina e Psicologia.");
		            } 
		else if (pisc > med && pisc > engE) {
		System.out.println("Psicologia venceu com " + pPisc + "%.");
		if (med == engE) System.out.println("Empate em 2º entre Medicina e Eng. Elétrica.");
		            } 
		else if (med == engE && med == pisc) {
		System.out.println("Empate triplo!");
		            } 
		else {
		System.out.println("Houve um empate entre os líderes.");
		            }
		} else {
		  System.out.println("Nenhum voto registrado.");
		        }
		    }
		}