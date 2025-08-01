package atividade04;

import java.util.ArrayList;

public class Locacao {
    int id;
    String status;
    double valorTotal;
    int qtdDiarias;
    double valorDesconto;
    ArrayList<Veiculo> veiculosLocados;

    public Locacao(int id, String status, double valorTotal, int qtdDiarias,
            double valorDesconto, ArrayList<Veiculo> veiculosLocados) {
        this.id = id;
        this.status = status;
        this.valorTotal = valorTotal;
        this.qtdDiarias = qtdDiarias;
        this.valorDesconto = valorDesconto;
        this.veiculosLocados = veiculosLocados;
    }

    public void imprimirCupomFiscal() {
        System.out.println("======= CUPOM FISCAL =======");
        System.out.println("Locação ID: " + id);
        System.out.println("Status: " + status);
        System.out.println("Quantidade de diárias: " + qtdDiarias);
        System.out.println("Desconto aplicado: R$ " + valorDesconto);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("------ Veículos Locados ------");

        for (Veiculo v : veiculosLocados) {
            System.out.println("ID: " + v.id);
            System.out.println("Modelo: " + v.modelo);
            System.out.println("Valor: R$ " + v.valor);
            System.out.println("-----------------------------");
        }

        System.out.println("==============================");
    }
}
