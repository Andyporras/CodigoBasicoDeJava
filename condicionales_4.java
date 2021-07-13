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
public class condicionales_4 {
    public static void main(String[] args){
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPana.showMessageDialog(null,"Es una letra mayuscula ");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"No es una letra mayuscula ");

            
        }
    }
    
}
