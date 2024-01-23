/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores_sobrecarga;

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
    
    
    //Constructor

    public Galletas(String tipo, String forma) {
        this.tipo = tipo;
        this.forma = forma;
    }

    public Galletas(String tipo, String forma, String sabor) {
        this.tipo = tipo;
        this.forma = forma;
        this.sabor = sabor;
        color = "verde";
    }
    
    
    
    public Galletas(String tipo, String forma, String sabor, String color) {
        this.tipo = tipo;
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
    }
    
    public Galletas(Galletas wafle){ //modificador de acceso (public) + nombre del constructor que coincide con la clase(Galletas) + Parametro(Galleta(clase) + nombre)
        this.tipo = wafle.tipo;
        this.forma = wafle.forma;
        this.sabor = wafle.sabor;
        this.color = wafle.color;
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
