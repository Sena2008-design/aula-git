package atividadeavaliativa;
import java.util.ArrayList;

public class ProgramaBancario {
    public static void main(String[] args) {
        
        Transacao t1 = new Transacao(1, "Depósito", 500.00); 

        Transacao t2 = new Transacao(); 
        t2.id = 2;
        t2.tipo = "Saque";
        t2.valor = 100.00;

        Transacao t3 = new Transacao();
        t3.id = 3;
        t3.tipo = "Depósito";
        t3.valor = 300.00;

        
        ArrayList<Transacao> listaTransacoes = new ArrayList<>();
        listaTransacoes.add(t1);
        listaTransacoes.add(t2);
        listaTransacoes.add(t3);


        ContaBancaria conta = new ContaBancaria(
                "João Silva",         
                "12345-6",            
                "001",                
                "Corrente",           
                "Finalizada",         
                2000.00,              
                500.00,               
                listaTransacoes       
        );

        
        conta.imprimirRelatorio();
    }
}


   
   
    
    




