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
    
                                                     
    }  
    
    public static int generarNumero(){
        
        Random numAleatorio = new Random();  
        
        int numeroAleatorio = numAleatorio.nextInt(15, 26);
        
        return numeroAleatorio;
    }
    
    public static char[] crearArray(){
                     
        int contador = 0;
        
        char[] abecedario = new char[26];
        
        for (int i = 0; 'A' < 'Z'; i++) {
                                    
            abecedario[i] = (char) i;
            
            contador++;
        }
        //return abecedario;                                    
    }
}
