package aula1605heranca;

 import java.util.ArrayList;
import java.util.UUID;

public class Cadastro {
   /**
 * @param args
 */
public static  void  main (String []args){
    Jogador jogador1 = new Jogador();

    jogador1.setld(UUID.randomUUID());
    jogador1.setCpf("10052546560");
    jogador1.setPosicao("atacante");
    jogador1.setNome("Sena");
    jogador1.setNumero("10");
    

   Jogador jogador2 = new Jogador();

    jogador2.setld(UUID.randomUUID());
    jogador2.setCpf("21546597854");
    jogador2.setPosicao("Lateral");
    jogador2.setNome("Kyara");
    jogador2.setNumero("7");


     ArrayList<Jogador>ListaDeJogadores = new ArrayList<>();
      ListaDeJogadores.add (jogador1);

     ArrayList<Jogador>ListaDeJogadores2 = new ArrayList<>();
      ListaDeJogadores2.add (jogador2); 
    
    
    Time timeMandante= new Time();
    timeMandante.setId(UUID.randomUUID());
    timeMandante.setNome(null);
    timeMandante.setJogadores(ListaDeJogadores);
    
    Time timeVisitante= new Time();
    timeVisitante.setId(UUID .randomUUID());
    timeVisitante.setNome(null);
    timeVisitante.setJogadores(ListaDeJogadores2);
     }









}
    










}
