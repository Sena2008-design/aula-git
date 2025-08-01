package atividadeavaliativa;

public class Transacao {
    int id;
    String tipo; // "Saque" ou "Depósito"
    double valor;

    // Construtor vazio
    public Transacao() {
    }

    // Construtor cheio
    public Transacao(int id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }
}