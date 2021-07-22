//Método constructor 
package ClasesyObjetos;

/**
 *
 * @author Andy Porras
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Métodos 
    
    //Método Constructor 
    /*Método 1
    public Persona(String _nombre,int _edad){
        //nombre=_nombre;
        //edad=_edad;
    }*/
    //Método 2
    public Persona(String nombre,int edad){
    this.nombre=nombre;
    this.edad=edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
}
