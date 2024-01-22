/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicios_Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de variables
        
        
        //Creacion de los objetos
        
        Automoviles audi = new Automoviles();
        Automoviles mg = new Automoviles();
        
        audi.setMarca("Audi");
        audi.setColor("Rojo");
        audi.setPotencia(200);
        audi.setPrecio(30000);
        
        mg.setMarca("MG");
        mg.setColor("Gris Oxido");
        mg.setPotencia(165);
        mg.setPrecio(34000);
        
        String dato = JOptionPane.showInputDialog("Introduzca la marca para mostrar los datos");
        
        if (dato.contains("Audi")) {
           audi.Caracteristicas();
        } else {
            mg.Caracteristicas();
        }
    }
    
}
