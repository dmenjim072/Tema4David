/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class EjemploOrdenacion {
    
    public static void main(String[] args) {
        int numeros[] = {6,5,3,1,2};
                        
        System.out.println(Arrays.toString(numeros));
        
        //Ordenamos los numeros del array
        Arrays.sort(numeros);
        
        //Mostramos el array
        System.out.println(Arrays.toString(numeros));
        
        //Busqueda binaria (para ahorrar buscar la mitad de numeros) ESTE es el que usamos para buscar!
        int posicion = Arrays.binarySearch(numeros, 6);
        System.out.println("Con busqueda binaria, el numero6 esta en la posicion: " + posicion);
        
        //Buscamos el numero 10 en el array
        int pos = busquedaSecuencial(numeros, 10);
        System.out.println("El 10 esta en la posicion: " + pos);//Devuelve -1 porque 10 no esta
        
        pos = busquedaSecuencial(numeros, 3);
        System.out.println("El 3 esta en la posicion: " + pos);
        System.out.println("El elemento de la posicion " + pos + " es: " + numeros[pos]);
           
    }
    
    //Posicion en el array donde se encuentra el elemento
    //Si hay varios, devuelve la primera
    //Si no existe devuelve -1
    public static int busquedaSecuencial(int[] array, int numeroBuscar){
        
        int indice = -1;
        
        //Recorremos el array completo
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscar == array[i]){//Lo he encontrado
                indice = i; //Guarda la posicion para devolverla
                break;
            }
                
        }
        return indice;
    }
    
    
    
    
            
       
        
   
    
}
