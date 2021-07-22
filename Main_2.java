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
public class Main_2 {
    public static void main(String[] args){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        Operaciones_2 op = new Operaciones_2();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        op.mostrarResultado();
    
    }
    
}
