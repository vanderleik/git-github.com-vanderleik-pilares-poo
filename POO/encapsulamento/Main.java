public class Main {
    
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "1980-01-01");

        Conta conta1 = new Conta(12345, 1000, cliente1);
        cliente1.adicionarConta(conta1);

        conta1.depositar(500);
        System.out.println("Saldo da conta " + conta1.getNumero() + ": " + conta1.getSaldo());

        try {
            conta1.sacar(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
