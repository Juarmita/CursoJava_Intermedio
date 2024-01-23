/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores_parametros;

/**
 *
 * @author juanm
 */
public class Main_Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de objetos
          Galletas cookie = new Galletas("Americana", "Redonda", "ChocoVainilla", "Tostada");
          Galletas wafle = new Galletas("Wafle", "Cuadrada", "Vaiinilla", "Amarilla");
          
          System.out.println("Tipo: "+cookie.getTipo());
    }
    
}
