/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args){
        Scanner entrada  = new Scanner(System.in);
        float salario,hora,salariofinal;
        
        hora =(float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas semanales que trabaja: "));
        salario=(float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora:"));
        
        salariofinal= hora*salario;
        
        JOptionPane.showMessageDialog(null,"El salario semanal es de:\n  "+salariofinal);
        
        /*
        System.out.println("Ingrese las horas semanales que trabaja: ");
        hora=entrada.nextFloat();
        System.out.println("\nIngrese su salario por hora");
        
        salario=entrada.nextFloat();
        salariofinal=hora*salario;
        System.out.println("\nEl salario semanal es de: "+salariofinal);
        
       */
    }
}
    
    

