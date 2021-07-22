/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class Main_3 {
    public static void main(String[] args){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        Operacion_3 op = new Operacion_3();
        //metodo 1
        /*
        int suma=op.sumar(n1, n2);
        int resta=op.restar(n1, n2);
        int mult=op.multiplicar(n1, n2);
        int div = op.dividir(n1,n2);
        
        op.mostrarResultado(suma, resta, mult, div);
        */
        //metodo 2
        
        System.out.println("La suma es: "+op.sumar(n1, n2));    
        System.out.println("La resta es: "+op.restar(n1, n2));
        System.out.println("La multiplicacion es: "+op.multiplicar(n1, n2));
        System.out.println("La division es: "+op.dividir(n1,n2));
        
        
    }
        
        
    
}
