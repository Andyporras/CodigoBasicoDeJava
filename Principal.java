/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class Principal {
    public static void main(String[] args){
        Cuadrilatero c1;
        float lado1,lado2;
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        
        if(lado1==lado2){//Es un cuadrado
            c1=new Cuadrilatero(lado1); 
        }
        else{
            c1=new Cuadrilatero(lado1,lado2);        
        }
        System.out.println("El perimetro es : "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}
