package bank;

public abstract class conta {

	private double saldo;

	public void depositar(double valor) {
		if(valor <= 0){
			throw new IllegalArgumentException("Valor de depósito inválido. O valor deve ser maior que zero.");
		}
		else{
			saldo += valor;
		}
	}

	public void sacar(double valor) {
		if(valor <= 0){
			throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser maior que zero.");
		}
		else if(valor > saldo){
			throw new IllegalArgumentException("Valor do saque maior que o saldo disponível.");
		}
		else{
			saldo -= valor;
		}
	}

	public void atualizarSaldo() {
		if (saldo < 0) {
			double excedente = saldo * -1;
			double taxa = excedente * 0.08;
			saldo -= taxa;
    	}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}