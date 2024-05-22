package POO.polimorfismo;

public class Main {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "1980-01-01");
        ContaCorrente contaCorrente = new ContaCorrente(12345, 1000, cliente1, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(54321, 500, cliente1, 0.01);

        // Usando polimorfismo para executar operações diferentes em contas diferentes
        OperacaoFinanceira operacao = new Deposito(contaCorrente);
        operacao.executar(500);

        operacao = new Saque(contaPoupanca);
        operacao.executar(200);

        // Supondo que conta2 seja outra conta válida
        Conta conta2 = new Conta(54321, 500, new Cliente("Maria", "987.654.321-00", "1990-02-15"));
        operacao = new Transferencia(contaCorrente, conta2);
        operacao.executar(300);
    }

}
