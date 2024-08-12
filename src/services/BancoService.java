package services;

import java.util.ArrayList;
import java.util.List;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class BancoService {
    private List<Conta> contas;

    public BancoService() {
        contas = new ArrayList<>();
    }

    public void criarContaCorrente(String titular, int numero) {
        ContaCorrente cc = new ContaCorrente(titular, numero);
        contas.add(cc);
        System.out.println("Conta Corrente criada para " + titular);
    }

    public void criarContaPoupanca(String titular, int numero) {
        ContaPoupanca cp = new ContaPoupanca(titular, numero);
        contas.add(cp);
        System.out.println("Conta Poupança criada para " + titular);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

    public void exibirContas() {
        for (Conta conta : contas) {
            conta.mostrarDetalhes();
        }
    }
}
