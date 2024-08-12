package main;

import java.util.Scanner;

import models.Conta;
import services.BancoService;

public class Main {
    public static void main(String[] args) {
        BancoService bancoService = new BancoService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Menu Banco -----");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Verificar Saldo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    scanner.nextLine();  // Consumir a quebra de linha
                    String titularCC = scanner.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numeroCC = scanner.nextInt();
                    bancoService.criarContaCorrente(titularCC, numeroCC);
                    break;

                case 2:
                    System.out.print("Digite o nome do titular: ");
                    scanner.nextLine();  // Consumir a quebra de linha
                    String titularCP = scanner.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numeroCP = scanner.nextInt();
                    bancoService.criarContaPoupanca(titularCP, numeroCP);
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int numeroDeposito = scanner.nextInt();
                    Conta contaDeposito = bancoService.buscarConta(numeroDeposito);
                    if (contaDeposito != null) {
                        System.out.print("Digite o valor a depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        contaDeposito.depositar(valorDeposito);
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    int numeroSaque = scanner.nextInt();
                    Conta contaSaque = bancoService.buscarConta(numeroSaque);
                    if (contaSaque != null) {
                        System.out.print("Digite o valor a sacar: ");
                        double valorSaque = scanner.nextDouble();
                        contaSaque.sacar(valorSaque);
                    }
                    break;

                case 5:
                    System.out.print("Digite o número da conta: ");
                    int numeroSaldo = scanner.nextInt();
                    Conta contaSaldo = bancoService.buscarConta(numeroSaldo);
                    if (contaSaldo != null) {
                        contaSaldo.mostrarDetalhes();
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}
