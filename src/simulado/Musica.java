package simulado;

public class Musica {
    int id;
    String titulo;
    String artista;
    int duracaoSeg;
    String genero;

    // Construtor vazio
    public Musica() {
    }

    // Construtor cheio
    public Musica(int id, String titulo, String artista, int duracaoSeg, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
        this.genero = genero;
    }
}


