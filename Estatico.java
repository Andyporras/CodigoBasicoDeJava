//Miembros estatico de una clase
package paquete1;

/**
 *
 * @author Andy Porras
 */
public class Estatico {
    private static String frase = "Primera frase";
    
    public static int sumar(int n1,int n2){
    int suma=n1+n2;
    return suma;
    }
    public static void main(String[] args){
        System.out.println(Estatico.frase);
        System.out.println(Estatico.sumar(5, 5));

        /*
        Estatico ob1= new Estatico();
        Estatico ob2 = new Estatico();
        
        ob2.frase="Segunda frase";
        
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    */
    }
    
}
