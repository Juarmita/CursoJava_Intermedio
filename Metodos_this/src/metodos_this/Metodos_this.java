/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos_this;

/**
 *
 * @author juanm
 */
public class Metodos_this {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Vamos a aprender el uso del this
        */
        //Creacion de objetos
        Galletas cookie = new Galletas();
        Galletas waffle = new Galletas();
        
        cookie.setTipo("Americana");
        System.out.println(cookie.getTipo());
    }
    
}
