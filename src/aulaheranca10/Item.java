package aulaheranca10;

public class Item {
    public Item (int quantidade , Obra obra){
        this. quantidade = quantidade;
        this.obra= obra;
    }
    private int quantidade ; 
    private Obra obra;
    public Item (){
    }
    public int getQuantidade (){
        return quantidade;
    }
    public Obra getObra(){
        return obra;
    }
    public void setObra(Obra obra){
        this.obra = obra;
    }




}
