/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

import static java.time.Clock.system;

/**
 *
 * @author Andy Porras
 */
public class Coche {
    String color;
    String marca;
    int km;
    
    public static void main(String[] args){
      Coche coche1 = new Coche();
      coche1.color = "Negro";
      coche1.marca = "Audi";
      coche1.km = 0;
      
      System.out.println("El colo del coche1 es: "+coche1.color);
      System.out.println("La marca del coche1 es: "+coche1.marca);
      System.out.println("El kilometraje del coche1 es: "+coche1.km);
      
      Coche coche2 = new Coche();
      
      coche2.color="Blanco";
      coche2.marca="Ferrari";
      coche2.km=100;
      
      System.out.println("\nEl colo del coche2 es: "+coche2.color);
      System.out.println("La marca del coche2 es: "+coche2.marca);
      System.out.println("El kilometraje del coche2 es: "+coche2.km);
      
      
    }
}
