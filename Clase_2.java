/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Andy Porras
 */
public class Clase_2 {
    public static void main(String[] args){
        Clase_1 objeto1 = new Clase_1();
        
        objeto1.setEdad(10);
        System.out.println("La edad es "+objeto1.getEdad());
        
        objeto1.setNombre("Andy");
        System.out.println("Mi nombre es "+objeto1.getNombre());
        
    }
    
}
