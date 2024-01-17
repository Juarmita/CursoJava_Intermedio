/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author juanm
 */
public class Galleta {
    /*
        Estudio de el funcionamiento de las clases com
        ejemplos. En este caso vamos a ver los ejemplos
        con galletas para hacer el símil.
    */
    //atributos
    String tipo;
    public String forma; //Con public decimos que es un atributo de acceso publico
    private String sabor;//Con private indicamos que es un atributo de acceso privado
    String color;
    //constructor
    public Galleta(){
        
    }
    //metodos
    void receta1(){
        System.out.println("Horneamos galleta y luego le ponemos chocolate");
    }
    void receta2(){
        System.out.println("Horneamos galleta y luego le ponemos vainilla");
    }
    void receta3(){
        System.out.println("Primero le damos forma y luego horneamos");
    }
}
