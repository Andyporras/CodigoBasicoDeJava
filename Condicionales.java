/*
== igual
!= diferente
> mayor
< menor
>= mayor o igual
<= menor o igual
 */
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class Condicionales {
    public static void main(String[] args){
        int numero,dato=5;
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(numero<=dato){
            JOptionPane.showMessageDialog(null,"El numero es menor o igual a 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es mayor a 5");

        }
    }
    
}
