package atividade04;

import java.util.ArrayList;

public class CadastroLocacao {
    public static void main(String[] args) {
        // Criando 3 veículos
        Veiculo veiculo1 = new Veiculo(1, "Gol", 100.0);
        Veiculo veiculo2 = new Veiculo(2, "Uno", 90.0);
        Veiculo veiculo3 = new Veiculo(3, "Onix", 120.0);

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(veiculo1);
        listaVeiculos.add(veiculo2);
        listaVeiculos.add(veiculo3);

        Locacao locacao = new Locacao(
            101, // id
            "Confirmada", // status
             // valorTotal
            3, // qtdDiariççças
            10.0, // valorDesconto
            listaVeiculos // lista de veículos
        );

        // Imprimir cupom fiscal a partir do objeto locacao
        locacao.imprimirCupomFiscal();
    }
}
