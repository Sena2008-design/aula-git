package simulado;

 
     import java.time.LocalDateTime;
     import java.util.List;

public class Playlist {
    int id;
    String nome;
    boolean publica;
    int totalMusicas;
    int duracaoTotalSeg;
    LocalDateTime dataCriacao;
    List<Musica> musicas;

    // Construtor vazio
    public Playlist() {
    }

    // Construtor cheio
    public Playlist(int id, String nome, boolean publica, int totalMusicas,
                    int duracaoTotalSeg, LocalDateTime dataCriacao, List<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.publica = publica;
        this.totalMusicas = totalMusicas;
        this.duracaoTotalSeg = duracaoTotalSeg;
        this.dataCriacao = dataCriacao;
        this.musicas = musicas;
    }

    // Método para imprimir relatório
    public void imprimirRelatorio() {
        System.out.println("======= PLAYLIST =======");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Pública: " + (publica ? "Sim" : "Não"));
        System.out.println("Total de Músicas: " + totalMusicas);
        System.out.println("Duração Total: " + duracaoTotalSeg + " segundos");
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("------ Músicas ------");

        for (Musica m : musicas) {
            System.out.println("ID: " + m.id);
            System.out.println("Título: " + m.titulo);
            System.out.println("Artista: " + m.artista);
            System.out.println("Gênero: " + m.genero);
            System.out.println("Duração: " + m.duracaoSeg + " seg");
            System.out.println("----------------------");
        }

        System.out.println("========================");
    }
}









   