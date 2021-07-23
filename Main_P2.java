/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

/**
 *
 * @author Andy Porras
 */
public class Main_P2 {
    public static void main(String[] args){
        Persona_2 persona1 =new Persona_2("Andy",21);
        persona1.correr();
        
        Persona_2 persona2=new Persona_2("70301010");
        persona2.correr(100);
    }    
}
