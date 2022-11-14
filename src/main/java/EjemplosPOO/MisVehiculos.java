/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

import java.util.Scanner;


public class MisVehiculos {
    public static void main(String[] args) {
             
    String color = "";
    String marca = ""; 
    String modelo = ""; 
    String matricula = ""; 
     
    Vehiculo miCacharro = new Vehiculo(4, 500, 1600, color, marca, modelo, matricula);
    System.out.println(miCacharro);
    
    
    
        
    }
    
    
    
}
