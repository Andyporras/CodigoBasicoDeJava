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
public class condicionales_8 {
    public static void main(String[] args){
        int num;
        
        num =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99 999: "));
        
        if((num>=0)&&(num<=9)){
            JOptionPane.showMessageDialog(null,"Tienen 1 cifra");
        }
        else if((num>=10)&&(num<=99)){
            JOptionPane.showMessageDialog(null,"Tienen 2 cifra");
        }
        else if((num>=100)&&(num<=999)){
            JOptionPane.showMessageDialog(null,"Tienen 3 cifra");
        }
        else if ((num>=1000)&&(num<=9999)){
            JOptionPane.showMessageDialog(null,"Tienen 4 cifra");
        }
        else if ((num>=10000)&&(num<=99999)){
            JOptionPane.showMessageDialog(null,"Tienen 5 cifra");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero ingresado no esta entre 0 y 99 999");
        }
    }
    
}
