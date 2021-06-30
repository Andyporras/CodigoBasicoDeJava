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
public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        System.out.println("Digite la nota de participacion: ");
        participacion=entrada.nextFloat();
        System.out.print("\nDigite la nota del primer examen parcial: ");
        primerExamen=entrada.nextFloat();
        System.out.print("\nDigite la nota del segundo examen: ");
        segundoExamen=entrada.nextFloat();
        System.out.print("\nDigite la nota del examen final: ");
        examenFinal=entrada.nextFloat();
        
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
       //suma las notas
       notaFinal=participacion+primerExamen+segundoExamen+examenFinal;
       
       //imprimo las notas
       
       System.out.println("La nota final es de: "+notaFinal);
       
        
        
                
        
    }
    
}
