/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author juanm
 */
public class Clase_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vamos a crear un objeto de tipo galleta
        //Tiene que coincidir la declaracion con el nombre de la clase
        //Clase +  nombre objeto = new + Clase
        Galleta cookie = new Galleta();
        Galleta waffle = new Galleta();
        /*
            Explicacion del new: Se usa para crear nuevas
            instancias definidas por el usuario.
            Declaracion = Instancia -> Galleta cookie = new Galleta();
            En este caso () es un constructor que en este caso esta vacio
        
        */
        
        
        cookie.forma = "Redonda";//Esta forma es inicial, hay que usar METODOS
        cookie.color = "Tostada";
        cookie.sabor = "Vainilla y chocolate";
        cookie.tipo = "Americana";
        
        waffle = cookie;//Aqui hacemos que apunte a la ubicacion en memoeria de cookie
        
        System.out.println(""+cookie.forma);
        System.out.println(""+cookie.sabor);
        System.out.println(""+waffle.forma);
                
    }
    
}
