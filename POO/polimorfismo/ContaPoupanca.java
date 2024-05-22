package POO.polimorfismo;

public class ContaPoupanca extends Conta {
    
    private double rendimentoMensal;

    public ContaPoupanca(int numero, double saldo, Cliente cliente, double rendimentoMensal) {
        super(numero, saldo, cliente);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
    }
    
}
