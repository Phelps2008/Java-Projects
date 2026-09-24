package adega;

public class vinhos extends bebidas {

    @Override
    public String mostrarBebida() {
        return null;
    }

    @Override
    public boolean verificarPreco() {
        for (int i = 0; i < qv; i++) {
            if (promocoesV[i]) {
                return true;
            }
        }
        return false;
    }
    int qv;
    String nomesV[] = new String[100];
    String tiposV[] = new String[100];
    Double precosV[] = new Double[100];
    int safrasV[] = new int[100];
    boolean promocoesV[] = new boolean[100]; 
    
    public String nome(int i) {
        return this.nomesV[i];
    }
    public String tipo(int i) {
        return this.tiposV[i];
    }
    public double preco(int i) { 
        return this.precosV[i]; 
    }
    public int safra(int i) {
        return this.safrasV[i];
    }
    public boolean promocao(int i) {
        return this.promocoesV[i];
    }
}