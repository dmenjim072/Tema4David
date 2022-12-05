/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author smr1d
 */
public class Ejer03 {
    
    public static void main(String[] args) {
        
        //Crear un array de tamaño 20
        double[] numeros = new double[20];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 7.5;
        }
        
        //Rellenar el array con el valor 7.5 en todos sus numeros
        for (int i = 0; i < numeros.length; i++) {
                        
            //Lo mostramos
            System.out.println("El valor de " + (i + 1) + " es: " + numeros[i]);
            
            //Otra opcion
            //Arrays.fill(numeros, 0, 20, 7.5)            
        }
        
        //Realiza una copia del array anterior en un nuevo array
        double[] numeros2 = Arrays.copyOf(numeros, 20);
        
        
        //Imprime ambos arrays. No se usa clase Arrays
        System.out.println("Imprime ambos arrays");
        
        System.out.println("Array original");
        for(double i : numeros){//Hacemos un bucle foreach, para recorrer el array(izq) y elegimos que array "numeros"
            System.out.print(i + " - ");
        }
        
        System.out.println("Array copia");
        for(double i : numeros2){
            System.out.println(i + " - ");
        }
                
    
    }
}    
