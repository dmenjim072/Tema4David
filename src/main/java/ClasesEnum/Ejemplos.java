/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEnum;

/**
 *
 * @author david
 */
public class Ejemplos {
    
    public static void main(String[] args) {
        
        Modelo aleatorio = Modelo.getAleatorio();
        
        
        Vehiculo v = new Vehiculo();
        System.out.println(v);
        
        
        CatalogoVehiculos catalogo = new CatalogoVehiculos(15);
        catalogo.mostrarCatalogo();
        
        Vehiculo[] array = catalogo.getListaVehiculos();
        array[0].setBastidor("123A");
        System.out.println("------------------");
        catalogo.mostrarCatalogo();
        
        v.setBastidor("123A");
        System.out.println("v");
        int pos = catalogo.buscarVehiculo(v);
        System.out.println("posicion " + pos);
        
        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
        System.out.println("---------Despues de borrar-----------");
        catalogo.mostrarCatalogo();
    }
    
}
