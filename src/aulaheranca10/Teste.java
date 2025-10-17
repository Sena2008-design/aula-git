package aulaheranca10;

import java.util.UUID;

public class Teste {
    
public static void main (String [] args){
    //VANTAGENS / POSSIBILIDADE DE HERANÇA !!!

    // absstração?
    //não é posivel instanciar uma classe abstrata
    //Obra obra = new Obra();

    // polimorfismo 
    //possibilidade generalizaçaõ , ou seja, compatibilidade entre filhos e a mãe
    //Obra obraEbook = new Ebook();
    // Obra obraLivro = new Livro();

Ebook ebook = new Ebook ();
ebook.setId(UUID.randomUUID());
ebook.setIsbn
ebook.seturlMarcaDagua();
ebook.setTitulo("");
ebook.setValor("");

Livro livro = new Livro();
livro.setId(UUID.randomUUID());
livro.setIsbn(null);
livro.setTiragem(0);
livro.setTitulo(null);
livro.setValor(0);

venderObra(livro);
venderObra(ebook);


}
public static void venderObra(Obra obra){
    System.out.println("ID :" = obra.getId());
    System.out.println("Titulo:" = obra.getTitulo());

    if (obra instanceof Livro){
        System.out.println("vendendo livro...");
        Livro livroTemp = (Livro)obra;
        System. out.println("Tiragem" + livroTemp.getTiragem());
    
    }else if ( obra instanceof Ebook) {
        System.out.println("vendendo Ebook...");
        Ebook EbookTemp = (Ebook)obra;
        System. out.println("URL" + EbookTemp.geturlMarcaDagua());
    }

}


}
