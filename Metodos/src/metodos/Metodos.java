/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;

/**
 *
 * @author juanm
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ejemplo del uso de metodos
         */
        utilidades uso = new utilidades();//Clase + nombre = new + clase()<- Constructor vacio

        /*
        uso.saludar();//De esta forma hacemos la llamada al metodo
        System.out.println("La suma de los dos numeros es: " + uso.sumar2Numeros(2, 3));
         */
        //---------------------------------------------------------------------------------
        int resultado = uso.sumarNumeros(1, 3);

        System.out.println("Resultado: " + resultado);
    }

}
