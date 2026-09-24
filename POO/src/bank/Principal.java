package bank;

public class Principal {

    public static void main(String[] args) {
        try {
            menuConta menu = new menuConta();
            menu.executarMenu();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro na execução do sistema: " + e.getMessage());
        }
    }
}