/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Lacerda
 */
public class Balancea {
    
    
    
    public String isBalaciada2(String conjunto){
        String resultado="";
        String c = conjunto;
        int x=10;
        for (int i = 0; i < c.length()-1; i++) {
            //System.out.println("C: "+c+"  i: "+i+"  c["+i+"]: "+c.charAt(i)+"  length: "+c.length());
            if((c.charAt(i)+"").equals("{") && (c.charAt(i+1)+"").equals("}")){
                //System.out.println("entrou no if({)  i: "+i);
                c = c.substring(0,i)+""+c.subSequence(i+2, c.length());
                i=-1;
            }else if((c.charAt(i)+"").equals("[") && (c.charAt(i+1)+"").equals("]")){
                //System.out.println("entrou no if([)  i: "+i);
                c = c.substring(0,i)+""+c.subSequence(i+2, c.length());
                i=-1;
            }else if((c.charAt(i)+"").equals("(") && (c.charAt(i+1)+"").equals(")")){
                //System.out.println("entrou no if(()  i: "+i);
                c = c.substring(0,i)+""+c.subSequence(i+2, c.length());
                i=-1;
            }
            resultado = c;
        }
        if(resultado.equals("")){
            resultado = "0";
        }else{
            resultado = "1";
        }
        //System.out.println("C: "+c);
        
        return resultado;
    }
}
