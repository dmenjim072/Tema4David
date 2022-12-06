/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class Ejer06 {

    //Comparar arrays sin metodo
    public static void main(String[] args) {

        //Creamos arrays para compararlos
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};

        //Hacemos un  boolean para guardar la comparacion
        boolean comparacion1 = Arrays.equals(array1, array2);

        //Lo imprimimos para comprobar si son iguales
        System.out.println("Son iguales los arrays1 y 2?" + comparacion1);

        //Creamos arrays para compararlos
        int array3[] = {1, 2, 3, 4};
        int array4[] = {1, 2, 4};

        //Hacemos un  boolean para guardar la comparacion
        boolean comparacion2 = Arrays.equals(array3, array4);

        //Lo imprimimos para comprobar si son iguales
        System.out.println("Son iguales los arrays3 y 4?" + comparacion2);

        //Creamos arrays para compararlos
        int array5[] = {1, 2, 3};
        int array6[] = {1, 2, 2};

        //Hacemos un  boolean para guardar la comparacion
        boolean comparacion3 = Arrays.equals(array5, array6);

        //Lo imprimimos para comprobar si son iguales
        System.out.println("Son iguales los arrays5 y 6?" + comparacion3);
        
        compararArrays(array1, array4);
    }

    //Creamos un metodo para comparar los arrays con sustitutos
    public static boolean compararArrays(int[] aux1, int[] aux2) {
        
        //Declaramos la variable Y LA INICIALIZAMOS
        boolean comparacion = true;
           
           //Hacemos un bucle para que compare los valores del array uno a uno
           for (int i = 0; i < aux1.length; i++) {
               comparacion = aux1[i] == aux2[i];
        }
           
           //Lo mostramos en pantalla
           System.out.println(comparacion);
        return comparacion;
    }
}
