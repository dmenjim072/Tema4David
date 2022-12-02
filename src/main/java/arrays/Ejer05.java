/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;


public class Ejer05 {
    
    public static void main(String[] args) {
        
        //Hacemos un array de 10 numeros
        int[] numeros = new int[10];
        
        //llamamos al metodo para darle valores al array
        leerValoresArray(numeros);
        
        //llamamos al metodo para contar cuantos numeros positivos hay
        contarPositivos(numeros);
        
        //llamamos al metodo para contar cuantos numeros negativos hay
        contarNegativos(numeros);
        
        //llamamos al metodo para contar cuantos ceros hay
        contarCeros(numeros);
        
    }   
        
    public static void leerValoresArray(int[]aux){                    
        
        //Hacemos un bucle para preguntar el valor de cada numero
        for (int i = 0; i < aux.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el valor del numero " + (i + 1));
            aux[i] = teclado.nextInt();
            
            System.out.println("El valor es: " + aux[i]);//Lo mostramos
        }
    
    }

    public static int contarPositivos(int[]aux){
        
        //Creamos un total que es lo que vamos a devolver
        int totalPositivos = 0;
        
        //Hacemos un bucle para contar cuantos positivos hay dentro del array
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] > 0){
                totalPositivos++; //Sumamos a totalPositivos 1 cada vez que se cumpla la condicion
            }
        }
        
        System.out.println(totalPositivos);
        return totalPositivos; //devolvemos el valor
    }
    
    public static int contarNegativos(int[]aux){
        
        //Creamos un total que es lo que vamos a devolver
        int totalNegativos = 0;
        
        //Hacemos un bucle para contar cuantos negativos hay dentro del array
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] < 0){
                totalNegativos++; //Sumamos a totalNegativos 1 cada vez que se cumpla la condicion
            }
        }
        
        System.out.println(totalNegativos);
        return totalNegativos; //devolvemos el valor
    }
    
    public static int contarCeros(int[]aux){
        
        //Creamos un total que es lo que vamos a devolver
        int totalCeros = 0;
        
        //Hacemos un bucle para contar cuantos Ceros hay dentro del array
        for (int i = 0; i < aux.length; i++) {
            
            if(aux[i] == 0){
                totalCeros++; //Sumamos a totalCeros 1 cada vez que se cumpla la condicion
            }
        }
        
        System.out.println(totalCeros);
        return totalCeros; //devolvemos el valor
    }
    
    public static void mostrarArray(int[]aux){
        
        for (int i = 0; i < 10; i++) {
            System.out.println(aux[i]);
        }
    }
}
    

