import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao(valor, "Depósito"));
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao(valor, "Saque"));
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
