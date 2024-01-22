/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author juanm
 */
public class utilidades {
    //atributos

    //constructor
    //Metodos
    //Creacion de un metodo
    public void saludar() {//Modificador de acceso + tipo de metodo + nombre del metodo
        System.out.println("Hola te estoy saludando");
    }

    public double sumar2Numeros(int num1, int num2) {//declaracion de metodos con parametros
        double resultado = 0;//variable local

        resultado = num1 + num2;//ejecucion de la suma

        return resultado;//devolucion del valor de la suma
    }

    public int sumarNumeros(int num1, int num2) {
        int resultado = 0;

        resultado = num1 + num2;
        return resultado;
    }

    public int sumarNumeros(String num1, String num2) {
        int numero1 = Integer.parseInt(num1);//Hacemos conversion
        int numero2 = Integer.parseInt(num2);
        int resultado = 0;

        resultado = numero1 + numero2;
        return resultado;
    }

    public int sumarNumeros(float num1, float num2) {
        int numero1 = (int) num1;//Hacemos conversion explicita
        int numero2 = (int) num2;
        int resultado = 0;

        resultado = numero1 + numero2;
        return resultado;
    }

}
