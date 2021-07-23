/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

/**
 *
 * @author Andy Porras
 */
public class Persona_2 {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Metodos

    public Persona_2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona_2(String dni) {
        this.dni = dni;
    }
    public void correr(){
        System.out.println("soy "+nombre+"Tengo "+edad+"años y estoy corriendo una maraton");        
    }
    public void correr(int km){
        System.out.println("He corrido "+km+"kilometros");
    }
    
}
