/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_metodos_calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class calculos {
    //Atributos
    
    
    //Constructores
    
    
    //Metodos
    //Pedimos los operandos por pantalla
    
    public String operador1() {

        String numero1 = JOptionPane.showInputDialog("Introduce el primer operador: ");
        return numero1;
    }
    
    public String operador2(){
        String numero2 = JOptionPane.showInputDialog("Introduce el segundo operador: ");
        return numero2;
    }
    
    public String operacion(){
        String calculo = JOptionPane.showInputDialog("Introduce la operacion que quieras realizar: ");
        return calculo;
    }
    
    public double castingOperador1(String operador1){//Casting string a double
        
        double operador1Texto = Double.parseDouble(operador1);
        return operador1Texto;
    }
    
    public double castingOperador2(String operador2){//Casting string a double
        double operador2Texto = Double.parseDouble(operador2);
        return operador2Texto;
    }
    
    public double operacionSuma(double operador1, double operador2){
        double suma = operador1 + operador2;
        return suma;
    }
    
    public double operacionResta(double operador1, double operador2){
        double resta = operador1 - operador2;
        return resta;
    }
    
    public double operacionProducto(double operador1, double operador2){
        double producto = operador1 * operador2;
        return producto;
    }
    
    public double operacionDivision(double operador1, double operador2){
        double division = operador1 + operador2;
        return division;
    }
    
    public double operacionResto(double operador1, double operador2){
        double resto = operador1 + operador2;
        return resto;
    }
    
    public void mostrarResultado(double resultado){
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
    }
}
