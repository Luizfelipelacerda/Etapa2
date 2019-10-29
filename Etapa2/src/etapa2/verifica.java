/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa2;

/**
 *
 * @author Lacerda
 */
public class verifica {
    
    
    public boolean veri(String conjunto){
        boolean verificacaoOK = true;
        for (int i = 0; i < conjunto.length()-1; i++) {
            if(((conjunto.charAt(i)+"").equals("{")) || (conjunto.charAt(i)+"").equals("}") || (conjunto.charAt(i)+"").equals("[") || (conjunto.charAt(i)+"").equals("]") || (conjunto.charAt(i)+"").equals("(") || (conjunto.charAt(i)+"").equals(")") ){
                //System.out.println("char: "+conjunto.charAt(i));
                //System.out.println("TRUE");
            }else{
                verificacaoOK = false;
            }
        }
        return verificacaoOK;
    }
}
