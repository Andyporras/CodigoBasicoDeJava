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
public class Ejercicio_4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float salario,comision,valorVehiculo,vendido,salarioMensual;
        salario = 1000;
        comision=150;
        System.out.println("Digite el precio del vehiculo:");
        valorVehiculo=entrada.nextFloat();
        System.out.println("\nDigite cuanto vhiculos vendio:");
        vendido=entrada.nextFloat();
        salarioMensual=salario+(comision*vendido)+(valorVehiculo%5);
        
        System.out.println("\nEl salario mensual es de: "+salarioMensual);
        
    }
    
}
