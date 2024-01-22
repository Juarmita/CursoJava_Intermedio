/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_metodos_iva;

/**
 *
 * @author juanm
 */
public class Ejercicio_Metodos_IVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Logica
        
        utilidades calcularPrecio = new utilidades();
        String precio = calcularPrecio.producto();
        double precioSinIva = calcularPrecio.castingNumero(precio);
        double precioIva = calcularPrecio.calculoIva(precioSinIva);
        calcularPrecio.mostrarPrecio(precioIva);
    }
    
}
