package bank;

public class contaCorrente {

    private double saldo;
    private double limiteEspecial;

    public contaCorrente() {
        this.saldo = 0.0;
        this.limiteEspecial = 0.0;
    }

    public contaCorrente(double saldoInicial, double limiteEspecial) {
        this.saldo = saldoInicial;
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser maior que zero.");
        }

        double novoSaldo = this.saldo - valor;

        if (novoSaldo < -limiteEspecial) {
            throw new IllegalArgumentException("Saque não permitido. Limite especial ultrapassado.");
        }
        this.saldo = novoSaldo;
    }

    public void atualizarSaldo() {
        System.out.println("Saldo da Conta Corrente mantido em: R$ " + this.saldo);
    }

    @Override
    public String toString() {
        return "\n---ContaCorrente--- \nlimiteEspecial = " + limiteEspecial + " \nsaldo = " + saldo + "";
    }
}