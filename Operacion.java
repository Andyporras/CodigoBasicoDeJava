
package ClasesyObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Metodo para pedir al usuario que nos digte 2 numero 
    public void leerNumero(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
    }
    //metodo para sumar ambos numeros
    public void sumar(){
        suma=numero1+numero2;
    }
    //metodo para restar ambos numeros
    public void restar(){
        resta=numero1-numero2;
    }
    //metodo para multiplicar ambos numeros
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    //metodo para dividir ambos numeros
    public void dividir(){
        division=numero1/numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}