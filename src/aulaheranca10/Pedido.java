package aulaheranca10;

import java.util.List;
import java.util . UUID;


public class Pedido {
    public Pedido (){
    }
    public Pedido (UUID id , List <Item> itens){
        this.id = id;
        this.itens = itens;
    }
    private UUID id;
    private Lit <Item> itens;
    public UUID getId (){
        return id ;
    }
    public void setId(UUID  id ){
        this.id = id ;
    }
    public List <Item> getItens(){
        return Item ;
    }
    public void getItens(List<Item>  itens ){
        this . itens= itens ;
    }



}
