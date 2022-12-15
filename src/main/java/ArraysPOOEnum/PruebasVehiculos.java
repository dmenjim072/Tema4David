/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysPOOEnum;

/**
 *
 * @author david
 */
public class PruebasVehiculos {
    
    public static void main(String[] args) {
        
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);
        System.out.println("Nº vehiculos del catalogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        //Borramos el vehiculo nº 3 del catalogo
        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
        System.out.println("----------Despues de borrar el de la posicion 3----------");
        System.out.println("Nº vehiculos del catalogo: " + catalogo.getNumeroVehiculos());
        
        //Creamos otro vehiculo
        Vehiculo aux = new Vehiculo();        
        aux.setBastidor("1234");
        catalogo.añadirVehiculo(aux);
        
        System.out.println("-------------Despues de añadir-----------");
        System.out.println("Vehiculos del catalogo: " + catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        System.out.println("-----------");
        
        
        
//        Modelo aleatorio = Modelo.getAleatorio();
//        
//        
//        Vehiculo v = new Vehiculo();
//        System.out.println(v);
//        
//        
//        CatalogoVehiculos catalogo = new CatalogoVehiculos(15);
//        catalogo.mostrarCatalogo();
//        
//        Vehiculo[] array = catalogo.getListaVehiculos();
//        array[0].setBastidor("123A");
//        System.out.println("------------------");
//        catalogo.mostrarCatalogo();
//        
//        v.setBastidor("123A");
//        System.out.println("v");
//        int pos = catalogo.buscarVehiculo(v);
//        System.out.println("posicion " + pos);
//        
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        System.out.println("---------Despues de borrar-----------");
//        catalogo.mostrarCatalogo();
    }
    
}
