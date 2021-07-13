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
public class condicionales2 {
    public static void main(String[] args){
        int dato;
        
        dato=Interger.parseInt(JOptionPane.showInputDialog("Digite un numero  entre 1 y 5"));
        
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"Es el numero 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null,"Es el numero 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"Es el numero 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"Es el numero 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null,"Es el numero 5");
                    break;
            default: JOptionPane.showMessageDialog(null,"Es el numero no esta en el rango de uno y 5");
                    break;
          
         }            
        }
    }
    

