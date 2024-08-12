package models;

public class ContaCorrente extends Conta {
    private double taxaDeOperacao = 0.05;

    public ContaCorrente(String titular, int numero) {
        super(titular, numero);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaDeOperacao);
        super.sacar(valorComTaxa);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Conta Corrente - Titular: " + getTitular() + ", Número: " + getNumero() + ", Saldo: " + getSaldo());
    }
}
