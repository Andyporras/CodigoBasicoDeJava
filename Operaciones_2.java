
package ClasesyObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Andy Porras
 */
public class Operaciones_2 {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    public void sumar(int numero1,int numero2){
        suma=numero1+numero2;
    }
    //metodo para restar ambos numeros
    public void restar(int numero1,int numero2){
        resta=numero1-numero2;
    }
    //metodo para multiplicar ambos numeros
    public void multiplicar(int numero1,int numero2){
        multiplicacion=numero1*numero2;
    }
    //metodo para dividir ambos numeros
    public void dividir(int numero1,int numero2){
        division=numero1/numero2;
    }
    
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
