/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;
import java.util.Random;
/**
 *
 * @author david
 */


public class EjerClase2 {
    
    //Rellenar array char desde 'A' a 'Z'
    //Generar un tamaño aleatorio entre 15 y 26
    //Crear un array de este tamaño y rellenarlo con posiciones validas aleatorias
    //Crear string con los valores de las posiciones
    
    public static void main(String[] args) {
    
      
        
    char[] array1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o'
            ,'p','q','r','s','t','u','v','w','x','y','z'};
    
        crearArray(array1);
        
        System.out.println(array1[3] + " - " + array1[4]);
        
    }  
    
    public static int generarNumero(){
        
        Random numAleatorio = new Random();  
        
        int numeroAleatorio = numAleatorio.nextInt(15, 26);
        
        return numeroAleatorio;
    }
    
    public static char[] crearArray(char[] aux){
        
        Random numAleatorio = new Random();  
        
        int numeroAleatorio = numAleatorio.nextInt(15, 26);
        
        char[] arrayNuevo = new char[numeroAleatorio];
        
        for (int i = 0; i < numeroAleatorio; i++) {
                                    
            arrayNuevo[i] = (char) numeroAleatorio;
        }
        
        System.out.println(arrayNuevo[3] + " - " + arrayNuevo[4]);
        
        return arrayNuevo;       
    }
}
