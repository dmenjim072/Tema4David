/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author smr1d
 */
public class Ejer07 {
    
    public static void main(String[] args) {
        
        //Creamos el objeto teclado y objeto random
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();
        
        //Preguntamos el tamaño de los arrays y lo guardamos en teclado
        System.out.println("Cual es el tamaño de los arrays?");
        int tamaño = teclado.nextInt();
                                
        //Creamos los 2 arrays con las caracteristicas anteriores
        int[] array1 = new int[tamaño];
        int[] array2 = new int[tamaño];
        
        //Creamos un bucle for para que recorra todos los numeros del array1 y les asigne un numero aleatorio
        for (int i = 0; i < tamaño; i++) {
            int nAleatorio = numAleatorio.nextInt(0, 100 + 1);//Creamos la variable para guardar el num aleatorio que se va a guardar(0 - 100)
            array1[i] = nAleatorio;           
        }
        
        //Lo mismo para el array2
        for (int i = 0; i < tamaño; i++) {
            int nAleatorio = numAleatorio.nextInt(0, 100 + 1);//Creamos la variable para guardar el num aleatorio que se va a guardar(0 - 100)
            array2[i] = nAleatorio;
        }                
        
        //Comprobamos el valor inicial de los arrays
        imprimirArrays(array1, array2, tamaño);
        
        
        //NO NECESARIO (mostrar en pantalla el resultado)                                                  
        //Guardamos el resultado de la multiplicacion llamando al metodo multiplicar
        int[] resultado = multiplicar(array1, array2, tamaño);
        
        System.out.println("");
        
        //Mostramos en pantalla los valores del array ya multiplicados
        for (int i = 0; i < tamaño; i++) {
            System.out.print(" - " + resultado[i]);
        }
    }
    
    //Creamos un metodo para multiplicar los numeros de los array entre si usando variables aux como sustituto
    public static int[] multiplicar(int[] aux1, int[] aux2, int aux){//Aqui declaramos las variables sustitutas
        
        //Creamos un array que tenemos que devolver luego
        int[] multiplicacionTotal = new int[aux];
        
        //Hacemos un bucle for para recorrer el array y multiplicar los numeros que contiene entre si
        for (int i = 0; i < aux; i++) {
            multiplicacionTotal[i] = aux1[i] * aux2[i];
        }
        return multiplicacionTotal;
    }
    
    //Creamos un metodo para imprimir los valores de los arrays
    public static void imprimirArrays(int[] aux1, int[] aux2, int aux){
        
        for (int i = 0; i < aux; i++) {
            System.out.print(" - " + aux1[i]);
            //System.out.print(" - " + aux2[i]);
        }
        
        System.out.println("");
        
        for (int i = 0; i < aux; i++) {
            System.out.print(" - " + aux2[i]);
        }
    }
}


