/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos_this;

/**
 *
 * @author juanm
 */
public class Galletas {
    
    //atributos
    private String tipo;
    private String forma;
    private String sabor;
    private String color;
    
    //constructor
    public Galletas(){
        
    }
    
    //metodos
    //Creacion de un tipo getter->Getter se encarga de devolver un valor de un atributo a una clase
    public String getTipo(){//El parentesis se queda vacio por los getter no reciben parametros
        
        return tipo;
    }
    //Creacion de un setter -> Setter se encarga de asignar un valor recibido por parametro a un atributo e una clase
    public void setTipo(String tipo){//tipo void no devuelve nada(return)
        this.tipo = tipo;//ACLARACION this.tipo se refiere al private String tipo y = tipo al tipo del parametro local
    }
    
    
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
