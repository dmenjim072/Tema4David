/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejer08 {
    
    public static void main(String[] args) {
    
        //Creamos el objeto teclado y pedimos por teclado que nos indique un numero
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int tamaño = teclado.nextInt();
                        
        System.out.println("Se va a crear un array de tamaño: " + tamaño);
        
        //Creamos un array con el tamaño del numero indicado
        int[] array1 = new int[tamaño];
                
        //Pedimos que rellene el array con valores
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce los valores del array " + (i + 1) + ":");
            int valoresArray = teclado.nextInt();
            array1[i] = valoresArray;
        }
        
        System.out.println("Los valores del array son:");
        
        //Mostramos el array con asteriscos        
        for (int i = 0; i < array1.length; i++) {//Hacemos un primer bucle para recorrer el array
                        
            for (int j = 0; j < array1[i]; j++) {//Un segundo bucle para recorrer cada elemento del array
                
                System.out.print("*");//Ponemos un * segun el valor del elemento del array
            }
            System.out.println("");//Ponemos un salto de linea al final del bucle
            
        }//Vuelve arriba hasta que acabe el numero de elementos del array
        
    }
    
}
