/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ArraysPOOEnum;

import java.util.Random;

/**
 *
 * @author david
 */
public enum Color {
    
    ROJO, NEGRO, AMARILLO, VERDE, AZUL, BLANCO;
    
    //Metodo para devolver color aleatorio
    public static Color getAleatorio(){
        
        Random r = new Random();
        
        Color[] colores = Color.values();
        
        int posicion = r.nextInt(0, colores.length);
        
        return colores[posicion];
    }
}
