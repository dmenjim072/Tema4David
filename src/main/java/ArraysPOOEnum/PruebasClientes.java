/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysPOOEnum;

import ArraysPOOEnum.CatalogoClientes;
import ArraysPOOEnum.Clientes;

/**
 *
 * @author smr1d
 */
public class PruebasClientes {
    
    public static void main(String[] args) {
        
        //Creamos un catalogo usando el constructor
        CatalogoClientes catalogo1 = new CatalogoClientes(5);
        
        //Creamos clientes para probarlos
        Clientes persona1 = new Clientes("Pepe", "12345678X", "Jimenez");
        Clientes persona2 = new Clientes("Juan", "45678123D", "Fernandez");
        Clientes persona3 = new Clientes("Pedro", "9876543T", "Canales");        
        
        //Añadimos clientes (a la primera posicion que este vacia)
        catalogo1.añadirClientes(persona1);
        catalogo1.añadirClientes(persona2);
        catalogo1.añadirClientes(persona3);
        
        System.out.println("--------------------------------");
        
        //Mostramos el catalogo de clientes
        catalogo1.mostrarCatalogo(catalogo1);
                        
        System.out.println("--------------------------");
        
        //Mostramos los clientes que queramos
        System.out.println("Cliente nº 1: " + persona1);
        System.out.println("Cliente nº 2: " + persona2);
        
        //Borramos los clientes que queramos
        catalogo1.borrarClienteSeleccionado(persona1);
        catalogo1.borrarClienteSeleccionado(persona3);
        
        System.out.println("--------------------------------");
        
        //Mostramos el catalogo nuevamente con los cambios
        catalogo1.mostrarCatalogo(catalogo1);
        
        
        
    }
    
}
