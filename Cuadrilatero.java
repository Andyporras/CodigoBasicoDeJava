/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Andy Porras
 */
public class Cuadrilatero {
    //Atributo
    private float lado1;
    private float lado2;
//Métpdp Construtor 1(Cuadrilatero)

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Método Constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1){
        this.lado1=this.lado2=lado1;
    }
    public float getPerimetro(){
        float perimetro=2*(lado1+lado2);
        return perimetro;
    }
    public float getArea(){
        float area=(lado1*lado2);
        return area;
    }
}
