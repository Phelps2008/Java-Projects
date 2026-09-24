package vinicula;
import java.util.Scanner;

public class budega {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vinho vn = new vinho();
		int cod, resp; 
		
		do {
		System.out.println("Selecione o desejado: 1- cadastro / 2- preço / 3- mostrar detalhes");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("Quantos vinhos serão cadastrados?");
			vn.qv = sc.nextInt();
			for(int i = 0; i < vn.qv; i++) {
				System.out.println("--- Cadastro do " + (i + 1) + "º vinho ---");
				System.out.print("Nome: ");
				vn.nomesV[i] = sc.next();
				
				System.out.print("Tipo: ");
				vn.tiposV[i] = sc.next();
				
				System.out.print("Preço: ");
				vn.precosV[i] = sc.nextDouble();
				
				System.out.print("Safra: ");
				vn.safrasV[i] = sc.nextInt();
			}
			break;
			
		case 2:
		    System.out.println("Selecione o código do vinho:");
		    int j = sc.nextInt();
		    if (j >= 0 && j < vn.qv) {
		        System.out.println("===== Vinho Encontrado =====");
		        System.out.print("Nome: " + vn.nome(j) + " | "); 
		        System.out.print("Tipo: " + vn.tipo(j) + " | "); 
		        System.out.print("Preço: R$ " + vn.preco(j) + " | "); 
		        System.out.println("Safra: " + vn.safra(j));
		    } else {
		        System.out.println("Código inválido ou vinho não cadastrado!");
		    }
		    break;
			
		case 3:
			System.out.println("===== Todos os Vinhos:=====");
			for(int i = 0; i < vn.qv; i++) {
				System.out.print("Nome: " + vn.nome(i) + " | "); 
				System.out.print("Tipo: " + vn.tipo(i) + " | "); 
				System.out.print("Preço: R$ " + vn.preco(i) + " | "); 
				System.out.println("Safra: " + vn.safra(i));
			}
			System.out.println("====================================");
			break;
		}
		
		System.out.println("Use o 4 para voltar.");
		resp = sc.nextInt();
		} while(resp == 4);
	}
}