/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores_parametros;

/**
 *
 * @author juanm
 */
public class Galletas {
    //Atributos
    private String tipo;
    private String forma;
    private String sabor;
    private String color;
    
    
    //Constructores

    public Galletas(String tipo, String forma, String sabor, String color) {
        this.tipo = tipo;
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
    }

    //Metodos

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
