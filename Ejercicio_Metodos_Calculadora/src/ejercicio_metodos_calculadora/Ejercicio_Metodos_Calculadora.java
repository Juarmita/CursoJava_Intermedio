/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_metodos_calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Ejercicio_Metodos_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Logica del ejercicio

        calculos realizarCalculo = new calculos();//Realizamos la llamada para poder usar los metodos
        String numero1 = realizarCalculo.operador1();
        String numero2 = realizarCalculo.operador2();
        double operador1 = realizarCalculo.castingOperador1(numero1);
        double operador2 = realizarCalculo.castingOperador2(numero2);
        String operando = realizarCalculo.operacion();

        if (operando.contains("+")) {

            double resultado = realizarCalculo.operacionSuma(operador1, operador2);
            JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + resultado);
        } else if (operando.contains("-")) {
            double resultado = realizarCalculo.operacionResta(operador1, operador2);
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        } else if (operando.contains("*")) {
            double resultado = realizarCalculo.operacionProducto(operador1, operador2);
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultado);
        } else if (operando.contains("/")) {
            double resultado = realizarCalculo.operacionDivision(operador1, operador2);
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado);
        } else if (operando.contains("%")) {
            double resultado = realizarCalculo.operacionResto(operador1, operador2);
            JOptionPane.showMessageDialog(null, "El resultado del resto es: " + resultado);
        }

    }

}
 
    
    

