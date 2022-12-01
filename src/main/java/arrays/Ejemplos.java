/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author david
 */
public class Ejemplos {
    
    public static void main(String[] args) {
        //Inicializacion con valores
        //numeros[0] = 1, numeros[1] = 2..
        int[] numeros = {1, 2, 3, 4, 5, 6 ,7};
        
        System.out.println("Elemento de indice 5: " + numeros[5]);
        //Puedo recorrer cualquier elemento dentro del rango 0 y numeros.lenght -1
        //System.out.println("Elemento de indice -1: " + numeros[7]);
        
        System.out.println("Tamaño del array numeros: " + numeros.length);
        
        //Imprimimos todos los elementos del array
        for(int i = 0; i<numeros.length;i++){
            System.out.print(" - " + numeros[i]);
        }
        
        System.out.println("\n-----------------------");
        
        //foreach (izquierda recibe el dato en cuestion, derecha estrucura de datos)
        for(int aux:numeros){
            System.out.print(" - " + aux);
        }
        
        System.out.println("\n-----------------------");
        
        //Cambiamos el valor indice5 = 90
        numeros[5] = 90; 
        
        for(int i = 0; i<numeros.length;i++){
            System.out.print(" - " + numeros[i]);
        }
        
    }
}
