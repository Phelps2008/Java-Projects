package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {
    protected int opcao;
    protected Scanner scanner = new Scanner(System.in);

    public void executarMenu() {
        System.out.print("Escolha uma opção: ");
        try {
            this.opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros!");
            scanner.nextLine(); // Descarta a entrada inválida do buffer
            this.opcao = -1;
        }
    }

    public void avaliarOpcaoEscolhida() {
        // Método sobrescrito pelas subclasses
    }
}