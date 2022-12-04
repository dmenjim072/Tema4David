/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author smr1d
 */
public class Ejer03 {
    
    public static void main(String[] args) {
        
        double[] numeros = new double[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 7.5;
        }
        
        for (int i = 0; i < numeros.length; i++) {
                                                
            System.out.println("El valor de " + (i + 1) + " es: " + numeros[i]);//Lo mostramos
        }
    
    }
}    
