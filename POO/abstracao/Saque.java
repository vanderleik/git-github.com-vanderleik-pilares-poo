package POO.abstracao;

public class Saque extends OperacaoFinanceira {

    public Saque(Conta conta) {
        super(conta);
    }

    @Override
    public void executar(double valor) {
        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
