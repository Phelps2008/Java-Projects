package vinicula;
import java.util.Scanner;

public class vinho {
	Scanner sc = new Scanner(System.in);
	int qv;
	
	String nomesV[] = new String[100];
	String tiposV[] = new String[100];
	Double precosV[] = new Double[100];
	int safrasV[] = new int[100];
	
	
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
}