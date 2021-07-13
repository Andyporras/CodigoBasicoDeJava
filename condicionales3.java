/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class condicionales3 {
    public static void main(String[] args){
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
     if(numero%10==0){
         JOptionPane.showMessageDialog(null,"El numero "+numero+" es multiplo de 10");
     
     }
     else{
         JOptionPane.showMessageDialog(null,"El numero "+numero+" no es multiplo de 10");
    
     }
    
    }
    
}
