//Constantes
package paquete1;

/**
 *
 * @author Andy Porras
 */
public class Individio {
    private final String nombre;
    private int edad;
    
    //Construtor 
    public Individio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    public void mostrarDatos(){
        System.out.println("El mobre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     
    
    
}
