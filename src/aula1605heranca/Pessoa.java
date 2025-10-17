package aula1605heranca;

import java.util.UUID;

public class Pessoa  {
    private UUID id;
    private String nome;
    private String cpf;

    public Pessoa (UUID id, String nome , String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;  
    }
    public Pessoa(){
    }
    public UUID getid(){
        return id ;
    }
    public void setld (UUID id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void getCpf(){
        return ;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }





}
