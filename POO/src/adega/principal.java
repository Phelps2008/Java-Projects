package adega;

import java.util.Scanner;

import vinicula.vinho;

public class principal {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		vinhos vn = new vinhos();
		refrigerante rf = new refrigerante();
		suco so = new suco();
		int descP;
		int cod, resp; 
		
		do {
		System.out.println("Selecione o desejado: 1- cadastro / 2- preço / 3- mostrar detalhes");
		cod = sc.nextInt();
		switch(cod) {
		case 1:
			System.out.println("Qual a bebida deseja cadastrar? (1- Vinho/ 2- Refrigerante/ 3-Suco)");
			int res = sc.nextInt();
			switch(res) {
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
					System.out.print("Está em promoção? (S/N): ");
			        String resposta = sc.next();
			        vn.promocoesV[i] = resposta.equalsIgnoreCase("S");
			    }
			    break;
			case 2:
				System.out.println("Quantos refrigerantes serão cadastrados?");
				rf.qr = sc.nextInt();
				for(int i = 0; i < rf.qr; i++) {
					System.out.println("--- Cadastro do " + (i + 1) + "º Refrigerante ---");
					System.out.print("Nome: ");
					rf.nomesR[i] = sc.next();
					System.out.print("Sabor: ");
					rf.tiposR[i] = sc.next();
					System.out.print("Preço: ");
					rf.precosR[i] = sc.nextDouble();
					System.out.print("Está em promoção? (S/N): ");
			        String resposta = sc.next();
			        rf.promocoesR[i] = resposta.equalsIgnoreCase("S");
			    }
			    break;
			case 3:
				System.out.println("Quantos sucos serão cadastrados?");
				so.qs = sc.nextInt();
				for(int i = 0; i < so.qs; i++) {
					System.out.println("--- Cadastro do " + (i + 1) + "º Suco ---");
					System.out.print("Nome: ");
					so.nomesS[i] = sc.next();
					System.out.print("Sabor: ");
					so.saborS[i] = sc.next();
					System.out.print("Preço: ");
					so.precosS[i] = sc.nextDouble();
					System.out.print("Está em promoção? (S/N): ");
			        String resposta = sc.next();
			        so.promocoesS[i] = resposta.equalsIgnoreCase("S");
			    }
			    break;
				}
			break;
			
		case 2:
		  System.out.println("qual produto quer consultar?(1- Vinho/ 2- Refrigerante/ 3-Suco)");
		  descP = sc.nextInt();
		  switch(descP) {
		  case 1:
			    System.out.println("Selecione o código do vinho:");
			    int j = sc.nextInt();
			    if (j >= 0 && j < vn.qv) {
			        System.out.println("===== Vinho Encontrado =====");
			        System.out.print("Nome: " + vn.nome(j) + " | "); 
			        System.out.print("Tipo: " + vn.tipo(j) + " | "); 
			        System.out.print("Preço: R$ " + vn.preco(j) + " | "); 
			        System.out.print("Safra: " + vn.safra(j) + " | "); 
			        if (vn.promocao(j)) {
			            System.out.println("Status: EM PROMOÇÃO!");
			        } else {
			            System.out.println("Status: Preço normal.");
			        }
			        
			    } else {
			        System.out.println("Código inválido ou vinho não cadastrado!");
			    }
			    break;  
		  case 2:
			  System.out.println("Selecione o código do refrigerante:");
			    int k = sc.nextInt();
			    if (k >= 0 && k < rf.qr) {
			        System.out.println("===== Refrigerante Encontrado =====");
			        System.out.print("Nome: " + rf.nome(k) + " | "); 
			        System.out.print("Sabor: " + rf.tipo(k) + " | "); 
			        System.out.print("Preço: R$ " + rf.preco(k) + " | "); 
			        if (rf.promocao(k)) {
			            System.out.println("Status: EM PROMOÇÃO!");
			        } else {
			            System.out.println("Status: Preço normal.");
			        }
			    } else {
			        System.out.println("Código inválido ou refrigerante não cadastrado!");
			    }
			  break;	  
		  case 3:
			  System.out.println("Selecione o código do suco:");
			    int y = sc.nextInt();
			    if (y >= 0 && y < so.qs) {
			        System.out.println("===== Suco Encontrado =====");
			        System.out.print("Nome: " + so.nome(y) + " | "); 
			        System.out.print("Tipo: " + so.tipo(y) + " | "); 
			        System.out.print("sabor: R$ " + so.preco(y) + " | ");
			        if (so.promocao(y)) {
			            System.out.println("Status: EM PROMOÇÃO!");
			        } else {
			            System.out.println("Status: Preço normal.");
			        }
			    } else {
			        System.out.println("Código inválido ou suco não cadastrado!");
			    }
			  break;
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
			System.out.println("===== Todos os Refrigerantes:=====");
			for(int i = 0; i < rf.qr; i++) {
				System.out.print("Nome: " + rf.nome(i) + " | "); 
				System.out.print("Tipo: " + rf.tipo(i) + " | "); 
				System.out.print("Preço: R$ " + rf.preco(i) + " | "); 
			}
			System.out.println("====================================");
			System.out.println("===== Todos os Sucos:=====");
			for(int i = 0; i < so.qs; i++) {
				System.out.print("Nome: " + so.nome(i) + " | "); 
				System.out.print("Tipo: " + so.tipo(i) + " | "); 
				System.out.print("Preço: R$ " + so.preco(i) + " | "); 
			}
			System.out.println("====================================");
			break;
		}
		System.out.println("Use o 4 para voltar.");
		resp = sc.nextInt();
		} while(resp == 4);
	}
}