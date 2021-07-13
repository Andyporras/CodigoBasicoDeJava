/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class condicionales_5 {
    public static void main(String[] args){
        int horaTrabajadas;
        float salarioTotal;
        
        horaTrabajadas= Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas: "));
        
        if(horaTrabajadas <=40){
            salarioTotal= horaTrabajadas * 16;
                   
        }
        else{
            salarioTotal= (40*60)+((horaTrabajadas-40)*20);
            
        }
        JOptionPane.showMessageDialog(null,"El salario total es: "+salarioTotal);
        
    }
    
}
 