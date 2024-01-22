/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_metodos_iva;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class utilidades {
    //Atributos
    
    
    //Constructor
    
    
    //Metodos
    
    public String producto(){//Introducimos el precio por pantalla
        
        String precio = JOptionPane.showInputDialog("Introduce un precio: ");
        return precio;
    }
    
    public double castingNumero(String precioProducto){//nos hace la conversion de String a double
        
        double precio = Double.parseDouble(precioProducto);
        return precio;
    }
    
    public double calculoIva(double precioSinIva){
        double precioConIva = precioSinIva + (precioSinIva * 0.21);
        return precioConIva;
    }
    
    public void mostrarPrecio(double precioIva){
        JOptionPane.showMessageDialog(null, "El precio con IVA es: "+precioIva);
    }
  
}
