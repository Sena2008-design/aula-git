package aula1605heranca;

import java.util.UUID;

public class Estadio {
   public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   private UUID id;
   private String nome;
   public Estadio() {
   }
   public Estadio(UUID id, String nome) {
    this.id = id;
    this.nome = nome;
   }

}
