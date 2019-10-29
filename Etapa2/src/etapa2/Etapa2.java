/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

import java.util.Scanner;

/**
 *
 * @author Lacerda
 */
public class Etapa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean conjuntoCerto = false;
/**        while(conjuntoCerto){
            System.out.println("digite um conjunto entre os caracteres {} () []");
            String conjunto = scanner.nextLine();
            if(conjunto)
        }
*/        
        
        String conjunto ="";
        boolean x =false;
        verifica v = new verifica();
        do{
            System.out.println("digite um conjunto entre os caracteres {} () []");
            conjunto = scanner.nextLine();
            x = v.veri(conjunto);
        }while(x == false);
        Balancea b = new Balancea();
        String resultado = b.isBalaciada2(conjunto);
        System.out.println("Entrada "+conjunto+" -> Saida "+resultado);
        
    }
    
}
