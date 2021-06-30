
package com.mycompany.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        //guardar las 3 notas
        System.out.println("Digite 3 calificaciones: ");
        nota1=entrada.nextFloat();
        nota2=entrada.nextFloat();
        nota3=entrada.nextFloat();
        
        suma=nota1+nota2+nota3; //Sumamos las 3 notas 
        
        System.out.println("\nLa suma es: "+suma);
        
        
        
    }
    
}
