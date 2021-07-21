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
public class condicionales_9 {
    
    public static void main(String[] args){
        int dia,mes,año;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia:"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
        año=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
        if((dia>=1)&&(dia<=30)){
            if((mes>=1)&&(mes<=12)){
                if(año!=0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
        }
    }
    
}
