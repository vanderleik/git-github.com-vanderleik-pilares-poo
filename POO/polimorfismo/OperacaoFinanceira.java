package POO.polimorfismo;

public abstract class OperacaoFinanceira {
    
    protected Conta conta;

    public OperacaoFinanceira(Conta conta) {
        this.conta = conta;
    }

    public abstract void executar(double valor);
    
}
