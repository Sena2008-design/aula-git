package aulaheranca10;
import java.util.UUID;

public class Ebook {
    
    private String urlMarcaDagua;

    public Ebook (UUID id, String titulo , String isbn , double valor , String urlMarcaDagua){
        super ();
        this . urlMarcaDagua = urlMarcaDagua;
    }

    public Ebook () {
    }
    
    public String geturlMarcaDagua(){
        return urlMarcaDagua;
    }


    
    public void seturlMarcaDagua(String urlMarcaDagua){
        this.urlMarcaDagua = urlMarcaDagua;
    }
      
    
  @Override
  public boolean aplicardesconto ( double porcentagem){
  }
  if (porcentagem >0.7){
    return false ;
  }
   double desconto = (super . getValor() * porcentagem);
   super .setValor (super . getValor() * desconto);








}
