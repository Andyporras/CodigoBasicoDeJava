/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ciclos;

/**
 *
 * @author Andy Porras
 */
public class Ciclos {
    public static void main(String[] arg){
        int num=2342;
        int num2=0;
        
        while(num>=1){
            num2+=num%10;
            num=num/10;
        }
        
        System.out.println("la suma del los digitos del numero es: "+num2);
           
        
    }

}
