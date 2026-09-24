package ListaK;
import java.util.Scanner;
public class K5 {

	public static void main(String[] args) {
		 
		Scanner x = new Scanner(System.in);

		        int idade;
		        String regiao;
		        String sexo;
		        String resp = "S";

		        int a = 0;
		        int b = 0;
		        int c = 0;
		        int d = 0;
		        int e = 0;
		        int f = 0;

		        System.out.println("REGIOES: Centro / Leste / Norte / Oeste / Sul");
		        System.out.println("SEXO: M ou F");
		        System.out.println("RESP: S para continuar / N para parar");

		        while(resp.equalsIgnoreCase("S")) {

		            System.out.print("\nIdade: ");
		            idade = x.nextInt();

		            System.out.print("Regiao: ");
		            regiao = x.next();

		            System.out.print("Sexo: ");
		            sexo = x.next();

		            if(sexo.equalsIgnoreCase("M")) {

		                if(regiao.equalsIgnoreCase("Leste") || regiao.equalsIgnoreCase("Centro")) {
		                    a++;
		                }

		                if(idade < 18 && regiao.equalsIgnoreCase("Norte")) {
		                    c++;
		                }

		            } else {

		                if(sexo.equalsIgnoreCase("F")) {

		                    b++;

		                    if(regiao.equalsIgnoreCase("Oeste") || regiao.equalsIgnoreCase("Norte") || regiao.equalsIgnoreCase("Sul")) {
		                        d++;
		                    }

		                    if(idade > 18 && regiao.equalsIgnoreCase("Oeste")) {
		                        e++;
		                    }

		                    if(regiao.equalsIgnoreCase("Centro")) {
		                        f++;
		                    }

		                }

		            }

		            System.out.print("Continuar? (S/N): ");
		            resp = x.next();

		        }

		        System.out.println("\nRESULTADOS");

		        System.out.println("Homens Leste e Centro: " + a);

		        if(b > 0) {
		            System.out.println("Mulheres Oeste/Norte/Sul: " + (d * 100.0 / b) + "%");
		        } else {
		            System.out.println("Mulheres Oeste/Norte/Sul: 0%");
		        }

		        System.out.println("Homens menores Norte: " + c);

		        if(b > 0) {
		            System.out.println("Mulheres maiores Oeste: " + (e * 100.0 / b) + "%");
		        } else {
		            System.out.println("Mulheres maiores Oeste: 0%");
		        }

		        if(b > 0) {
		            System.out.println("Mulheres Centro: " + (f * 100.0 / b) + "%");
		        } else {
		            System.out.println("Mulheres Centro: 0%");
		        }

	}

}
