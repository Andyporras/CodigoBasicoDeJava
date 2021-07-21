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
public class condicionales_6 {
    public static void main(String[] args){
        int num1,num2;
        
        num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        if((num1%2==0) && (num2%2==0)){
            JOptionPane.showMessageDialog(null,"Ambos numeros son par"); 
            return;
        }
        if((num1%2==1) && (num2%2==1)){         
            JOptionPane.showMessageDialog(null,"Ambos numeros son impar");
        }
        else{
            JOptionPane.showMessageDialog(null,"Ambos numeros son distinto.");

        }
    
{
        
        
    }
    }

    private static void and(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void elif(boolean par) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
