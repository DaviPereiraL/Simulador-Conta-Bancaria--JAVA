package models;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal = 0.02;

    public ContaPoupanca(String titular, int numero) {
        super(titular, numero);
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * rendimentoMensal;
        depositar(rendimento);
        System.out.println("Rendimento aplicado: " + rendimento);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Conta Poupança - Titular: " + getTitular() + ", Número: " + getNumero() + ", Saldo: " + getSaldo());
    }
}
