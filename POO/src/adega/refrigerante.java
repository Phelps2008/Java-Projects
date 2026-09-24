package adega;

public class refrigerante extends bebidas {

	@Override
	public String mostrarBebida() {
		// TODO Auto-generated method stub
		return null;
	}

	 @Override
	    public boolean verificarPreco() {
	        for (int i = 0; i < qr; i++) {
	            if (promocoesR[i]) {
	                return true;
	            }
	        }
	        return false;
	    }
	int qr;
	String nomesR[] = new String[100];
	String tiposR[] = new String[100];
	Double precosR[] = new Double[100];
	boolean promocoesR[] = new boolean[100]; 
	
	public String nome(int i) {
		return this.nomesR[i];
	}
	public String tipo(int i) {
		return this.tiposR[i];
	}
	public double preco(int i) { 
		return this.precosR[i]; 
	}
	public boolean promocao(int i) {
	    return this.promocoesR[i];
	    }
}
