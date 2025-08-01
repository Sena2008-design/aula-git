public class Produto {
		
    public int id;
    public String nome;
    public String descrição;
    public String codigoBarras;
    public Double valor;
    
    public Produto (){
    }
    
    public Produto(int id, String nome , String descrição , String codigoBarras , Double valor){
		    this.nome = nome;
		    this.id = id;
		    this.descrição = descrição;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }
    
   
    public void imprimir(){
		    System.out.println("Nome: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("descrição: " + this.descrição);
        System.out.println("codigoBarras " + this. codigoBarras);
        System.out.println("valor" + this. valor);

       }   
      }
