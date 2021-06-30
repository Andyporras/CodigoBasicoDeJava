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
public class Ejercicio_7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int horaTotal,sema,dias,horas;
        System.out.print("Digite el numero de horas: ");
        horaTotal=entrada.nextInt();
        
        sema=horaTotal/168;
        dias=horaTotal%168/24;
        horas=horaTotal%24;
        
        System.out.println("El equivalente es:");
        System.out.println("Semanas: "+sema);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        
        
    }
    
}
