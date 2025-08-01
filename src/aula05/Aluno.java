package aula05;

//Class DNA
//Objetivo definir a estrutura
public class Aluno {
    public Aluno(int id, String nome, String matricula, int idade) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    public int id;
    public String nome;
    public String matricula;
    public int idade;  

    // declarando explicitamente o método construtor vazio
    // alem de criar objeto executa o codigo contido no bloco
    public Aluno (){
        System.out.println("chamou o construtor vazio");

    }

    public Aluno (String nome){
        this.nome = nome ;

    }



    // asinatura:
    // proteção + retorno + nome + parâmetros
  
    public void imprimirDados(Aluno aluno){
        System.out.println("ID:" + id );
        System.out.println("Nome:" + nome);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Idade:" + idade );

    }
    //sobrecarga de métodos  = repetição da mesma assinatura
    // mudando somente o parâmetro
    public void imprimirDados(int ordem){
        System.out.println("Aluno:" + ordem );
        imprimirDados(ordem);

    }

     


}
  