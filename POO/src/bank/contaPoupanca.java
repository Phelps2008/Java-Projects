package bank;

public class contaPoupanca extends contaCorrente {

    private double reajusteMensal;

    public contaPoupanca() {
        super();
        this.reajusteMensal = 0.0;
    }

    public contaPoupanca(double saldoInicial, double reajusteMensal) {
        super(saldoInicial, 0.0);
        this.reajusteMensal = reajusteMensal;
    }

    public double getReajusteMensal() {
        return reajusteMensal;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido. O valor deve ser maior que zero.");
        }
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saque não permitido. Saldo insuficiente na Conta Poupança.");
        }
        setSaldo(getSaldo() - valor);
    }

    public void atualizarSaldo(double porcentagem) {
        if (porcentagem <= 0) {
            throw new IllegalArgumentException("Valor de reajuste inválido. O valor deve ser maior que zero.");
        }

        double rendimento = getSaldo() * (porcentagem / 100.0);
        setSaldo(getSaldo() + rendimento);
        this.reajusteMensal = porcentagem;
    }

    @Override
    public void atualizarSaldo() {
        if (this.reajusteMensal > 0) {
            atualizarSaldo(this.reajusteMensal);
        } else {
            System.out.println("Nenhum reajuste aplicado à Conta Poupança.");
        }
    }

    @Override
    public String toString() {
        return "\n--- ContaPoupanca --- \nreajusteMensal = " + reajusteMensal + " \nsaldo = " + getSaldo() + " ";
    }
}