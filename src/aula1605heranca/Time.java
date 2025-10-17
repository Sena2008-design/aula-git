package aula1605heranca;

import java.util.List;
import java.util.UUID;

public class Time {
    private UUID id;
    private String nome;
    private List<Jogador> jogadores;

    public Time (){
    }
    public UUID getId(){
      return id;  
    }
    public void setId(UUID id){
        this.id = id ;
    }
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome= nome;
    }
    public List<Jogador> getJogadores (){
        return jogadores;
    }
    public void setJogadores(List<Jogador>jogadores){
        this.jogadores = jogadores;
    }












}
