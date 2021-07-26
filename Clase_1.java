//Encapsulamiento y metodos accesores(Getters y seters)
package paquete1;

/**
 *
 * @author Andy Porras
 */
public class Clase_1 {
    private int edad;
    private String nombre;
    
    
    //Metodo setter: establecemos la edad
    public void setEdad(int edad){
        this.edad=edad;
    }
    //Metodo Getter: Mostar la edad
    
    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
