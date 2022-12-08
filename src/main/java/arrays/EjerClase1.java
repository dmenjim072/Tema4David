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
public class EjerClase1 {
    
    //Leer por teclado un numero int y decir si es capicua
    //El numero int pasarlo a string(78 -> "78"),de string a char[]("78" ->[7][8])
    
    public static void main(String[] args) {
                                            
        //Llamamos al metodo que contiene los demas y los guardamos en una variable boolean
        boolean pregunta = esCapicua(conversionNumero(pedirNumero()));
        
        pregunta = true;
        
        //Hacemos una condicion para que, segun el resultado nos diga si es capicua o no
        if(pregunta == true){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
        
    }
    
    //Hacemos el metodo para pedir un numero
    public static int pedirNumero(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero");
        int numero = teclado.nextInt();
        
        return numero;
    }
    
    //Hacemos el metodo para convertir el int a string y luego a char array
    public static char[] conversionNumero(int aux){
        
        String n = String.valueOf(aux);//De int a string
        
        char[] chars = n.toCharArray();//De string a array char
        
        return chars;
    }
    
    //Hacemos un metodo para comprobar si es capicua o no el numero pedido
    public static boolean esCapicua(char[] aux1){
    
        boolean respuesta = true;
        
        int letraFinal = aux1.length;//Hacemos un segundo punto de partida para empezar por la letra final
                        
        //Hacemos un bucle para que recorra el array
        for (int i = 0; i < aux1.length; i++) {
            
            letraFinal--;//Dentro del bucle le vamos quitando uno al contador
            
            if(aux1[i] != aux1[letraFinal]){//Si la primera letra es igual a la ultima sera true
                respuesta = false;
                break;
            }else{//Sino sera false
                respuesta = true;                                
            }            
        }        
        return respuesta;
    }
}
