package POO.polimorfismo;

public class ContaCorrente extends Conta {

    private double limiteCredito;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double limiteCredito) {
        super(numero, saldo, cliente);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (saldo + limiteCredito >= valor) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException("Saldo e limite de crédito insuficientes.");
        }
    }
    
}
