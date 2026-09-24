package bank;
import java.util.InputMismatchException;

public class menuConta extends menu {

    private contaCorrente contaCC;
    private contaPoupanca contaCP;

    public menuConta() {
        this.contaCC = new contaCorrente(500.0, 1000.0);
        this.contaCP = new contaPoupanca(5000.0, 0.01);
    }

    @Override
    public void executarMenu() {
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 – Conta Corrente");
            System.out.println("2 – Conta Poupança");
            System.out.println("0 – Sair");

            super.executarMenu();
            avaliarOpcaoEscolhida();

        } while (this.opcao != 0);
    }

    @Override
    public void avaliarOpcaoEscolhida() {
        switch (this.opcao) {
            case 1:
                operarContaCC();
                break;
            case 2:
                operarContaCP();
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private void operarContaCC() {
        do {
            System.out.println("\n--- SUBMENU CONTA CORRENTE ---");
            System.out.println("1 – Consultar Saldo");
            System.out.println("2 – Depositar");
            System.out.println("3 – Sacar");
            System.out.println("4 – Atualizar Saldo");
            System.out.println("0 – Voltar");

            super.executarMenu();

            switch (this.opcao) {
                case 1:
                    System.out.println(contaCC.toString());
                    break;
                case 2:
                    try {
                        System.out.print("Informe o valor do depósito: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaCC.depositar(valor);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite um valor numérico válido.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Informe o valor do saque: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaCC.sacar(valor);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite um valor numérico válido.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    contaCC.atualizarSaldo();
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    this.opcao = -1;
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (this.opcao != 0);
    }

    private void operarContaCP() {
        do {
            System.out.println("\n--- SUBMENU CONTA POUPANÇA ---");
            System.out.println("1 – Consultar Saldo");
            System.out.println("2 – Depositar");
            System.out.println("3 – Sacar");
            System.out.println("4 – Atualizar Saldo");
            System.out.println("0 – Voltar");

            super.executarMenu();

            switch (this.opcao) {
                case 1:
                    System.out.println(contaCP.toString());
                    break;
                case 2:
                    try {
                        System.out.print("Informe o valor do depósito: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaCP.depositar(valor);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite um valor numérico válido.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Informe o valor do saque: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaCP.sacar(valor);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite um valor numérico válido.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Informe o valor de reajuste: ");
                        double reajuste = scanner.nextDouble();
                        scanner.nextLine();
                        contaCP.atualizarSaldo(reajuste);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite um valor numérico válido.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu anterior...");
                    this.opcao = -1;
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (this.opcao != 0);
    }
}