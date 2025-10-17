package aulaheranca10;

import java.util.UUID;

public class Livro extends Obra{
    private static String isbn;
    private int tiragem;

    public Livro (UUID id, String titulo , String ibn, double valor , int tiragem){
        super ( id , titulo ,  isbn ,valor);
        this.tiragem = tiragem;
    }
    public Livro(){
    }
    public int getTiragem (){
        return tiragem;
    }
    public void setTiragem (int tiragem){
        this.tiragem = tiragem;
    }

}
