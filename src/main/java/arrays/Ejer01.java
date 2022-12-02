/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author david
 */
public class Ejer01 {
    
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6};
        
        int total = 0; //Creamos una variable para el total
        
        for (int i = 0; i < numeros.length; i++) {//hacemos un bucle para que se sume todo segun la cantidad de numeros que hay
            total = total + numeros[i];
        }
        
        System.out.println(total);
    }
    
}
