package simulado;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class CadastroApp {
    public static void main(String[] args) {

        // Criando músicas
        Musica m1 = new Musica(1, "Ordinary", "Alex Warren", 182, "Romantico"); // Construtor cheio

        Musica m2 = new Musica();
        m2.id = 2;
        m2.titulo = "Photograph";
        m2.artista = "Ed Sheeran";
        m2.duracaoSeg = 255;
        m2.genero = "Pop";

        Musica m3 = new Musica();
        m3.id = 3;
        m3.titulo = "Paradise";
        m3.artista = "Coldplay";
        m3.duracaoSeg = 260;
        m3.genero = "Rock";

        // Criando lista de músicas
        ArrayList<Musica> lista = new ArrayList<>();
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);

        Playlist playlist = new Playlist(
            101,
            "Clássicos Internacionais",
            true,
            3,
            580,
            LocalDateTime.now(),
            lista
    );

    // Imprimindo relatório
    playlist.imprimirRelatorio();
    }
}

