/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Andy Porras
 */
public class Ejecicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.print("Digite la catidad de dinero que tiene Guillermo: ");
        guillermo=entrada.nextFloat();
        
        luis=guillermo/2;
        juan=(guillermo+luis)/2;
        
        total=guillermo+luis+juan; 
        
        System.out.println("\nEl total seria de: "+total);
        
        
    }
    
    
}
