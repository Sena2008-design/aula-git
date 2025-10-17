package aula1605heranca;

import java.util.UUID;

public class Placar {
    private UUID id ;
    private int golsMandante;
    private int golsVisitante;


    public Placar (UUID id , int golsMandante , int golVisitante, int golsVisitante) {
        this.id = id;
        this.golsMandante = golsMandante;
        this.golsVisitante= golsVisitante;
    }
  
    public UUID getId(){
        return id ;
    }
    public void setId(UUID id) {
        this.id = id ;
    }
    public int getGolsMandante (){
        return golsMandante;
    }
    public void setGolsMandante(int golsMandante){
        this .golsMandante = golsMandante;
    }
    public int getGolsVisitantes(){
        return golsVisitante;
    }
    public void setGolsVisitante(int golsVisitante){
        this . golsVisitante = golsVisitante;
    }




}
