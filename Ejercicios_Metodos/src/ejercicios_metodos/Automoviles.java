/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author juanm
 */
public class Automoviles {

    //Atributos
    private String Marca;
    private String Color;
    private int Potencia;
    private double Precio;

    //Constructor
    public Automoviles() {

    }

    //Métodos
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void Caracteristicas() {
        String Caracteristicas = "";
        JOptionPane.showMessageDialog(null, "Marca: " + Marca + " " + "Color: " + Color + " " + "Potencia: " + Potencia + " " + "Precio: " + Precio);
    }
}
