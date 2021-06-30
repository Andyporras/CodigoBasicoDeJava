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
public class Ejercicio_6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float a,b,resultado;
        System.out.print("Digite el valor de a: ");
        a=entrada.nextFloat();
        System.out.print("Digite el valor de b: ");
        b=entrada.nextFloat();
        
        resultado=(a*a)+(b*b)+(2*a*b);
        System.out.println("La suma de la ecuacion cuadratica es de: "+resultado);
        
        
        
        
    }
    
}
