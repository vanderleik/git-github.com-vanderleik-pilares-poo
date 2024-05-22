package POO.abstracao;

public class Deposito extends OperacaoFinanceira{

    public Deposito(Conta conta) {
        super(conta);
    }

    @Override
    public void executar(double valor) {
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
    }
    
}
