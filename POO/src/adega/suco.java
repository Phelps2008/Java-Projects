package adega;

public class suco extends bebidas{

	@Override
	public String mostrarBebida() {
		// TODO Auto-generated method stub
		return null;
	}

	 @Override
	    public boolean verificarPreco() {
	        for (int i = 0; i < qs; i++) {
	            if (promocoesS[i]) {
	                return true;
	            }
	        }
	        return false;
	    }
	int qs;
	String nomesS[] = new String[100];
	String saborS[] = new String[100];
	Double precosS[] = new Double[100];
	boolean promocoesS[] = new boolean[100]; 
	
	
	public String nome(int i) {
		return this.nomesS[i];
	}
	public String tipo(int i) {
		return this.saborS[i];
	}
	public double preco(int i) { 
		return this.precosS[i]; 
	}
	public boolean promocao(int i) {
	    return this.promocoesS[i];
	    }
}