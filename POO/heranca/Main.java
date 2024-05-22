package POO.heranca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "1980-01-01");

        ContaCorrente contaCorrente = new ContaCorrente(12345, 1000.0, cliente1, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(54321, 500.0, cliente1, 0.01);

        try {
            contaCorrente.sacar(1200);
            System.out.println("Saque na conta corrente realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            contaCorrente.sacar(1600);
            System.out.println("Saque na conta corrente realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        contaPoupanca.aplicarRendimento();
        System.out.println("Rendimento aplicado na conta poupança.");
    }
}
