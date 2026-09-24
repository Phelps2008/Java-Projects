package adega;

public abstract class bebidas {
	private String nome;
	private double preco;	

	public abstract String mostrarBebida();
	public abstract boolean verificarPreco();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
