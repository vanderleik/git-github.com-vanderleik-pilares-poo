package POO.abstracao;

public class Main {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "1980-01-01");
        Conta conta1 = new Conta(12345, 1000, cliente1);

        OperacaoFinanceira deposito = new Deposito(conta1);
        deposito.executar(500);

        OperacaoFinanceira saque = new Saque(conta1);
        saque.executar(200);

        // Supondo que conta2 seja outra conta válida
        Conta conta2 = new Conta(54321, 500, new Cliente("Maria", "987.654.321-00", "1990-02-15"));
        OperacaoFinanceira transferencia = new Transferencia(conta1, conta2);
        transferencia.executar(300);
    }
    
}
