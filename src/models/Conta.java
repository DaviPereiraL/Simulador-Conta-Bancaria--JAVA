package models;

public abstract class Conta {
	private String titular;
	private int numero;
	private double saldo;

	public Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = 0.0;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado: " + valor);
		} else {
			System.out.println("Valor de depósito inválido!");
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque realizado: " + valor);
		} else {
			System.out.println("Saldo insuficiente ou valor de saque inválido!");
		}
	}

	public abstract void mostrarDetalhes();
}
