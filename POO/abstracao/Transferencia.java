package POO.abstracao;

public class Transferencia extends OperacaoFinanceira {
    
    private Conta contaDestino;

    public Transferencia(Conta contaOrigem, Conta contaDestino) {
        super(contaOrigem);
        this.contaDestino = contaDestino;
    }

    @Override
    public void executar(double valor) {
        try {
            conta.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
