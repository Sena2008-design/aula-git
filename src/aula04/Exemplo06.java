package aula04;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor para exibir a tabuada:");
        int valor = teclado.nextInt();

        System.out.println(valor + "X" + valor  + "=" + (1*valor));
        
        //inputs de repetição 
        // valor inicial
        //condição de parada
        // incremento

        int i = 1;
        while( i <= 10){
            System.out.println(i + "X" + valor + "=");
            i = i + 1;
        }
    }
}