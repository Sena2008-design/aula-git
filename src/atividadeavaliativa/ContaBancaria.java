package atividadeavaliativa;

import java.util.ArrayList;

public class ContaBancaria {
    String titular;
    String numero;
    String agencia;
    String tipoConta; 
    String statusConta; 
    double saldo;
    double limite;
    ArrayList<Transacao> transacoes;

    
    public ContaBancaria() {
    }

    
    public ContaBancaria(String titular, String numero, String agencia, String tipoConta,
                         String statusConta, double saldo, double limite, ArrayList<Transacao> transacoes) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.statusConta = statusConta;
        this.saldo = saldo;
        this.limite = limite;
        this.transacoes = transacoes;
    }

    
    public void imprimirRelatorio() {
        System.out.println("=========== RELATÓRIO BANCÁRIO ===========");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Status da Conta: " + statusConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite: R$ " + limite);
        System.out.println("------------- Transações -------------");

        for (Transacao t : transacoes) {
            System.out.println("ID: " + t.id + " | Tipo: " + t.tipo + " | Valor: R$ " + t.valor);
        }

        System.out.println("==========================================");
    }
}



    