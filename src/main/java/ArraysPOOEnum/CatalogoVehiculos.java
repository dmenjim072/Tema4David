/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArraysPOOEnum;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class CatalogoVehiculos {
    
    private int numeroVehiculos;
    private Vehiculo[] listaVehiculos;
    
    //El constructor recibe el tamaño del catalogo e inicializa la estructura
    //de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamaño){
        
        tamaño=Math.abs(tamaño);
        
        this.numeroVehiculos = tamaño;
        this.listaVehiculos = new Vehiculo[tamaño];
        
        //Una vez creada la estructura de datos le doy valor a cada elemento(de forma aleatoria)
        for (int i = 0; i < listaVehiculos.length; i++) {
            listaVehiculos[i] = new Vehiculo();
        }
    }
    
    public void mostrarCatalogo(){
        
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
        
    }
    
    public void borrarVehiculo(Vehiculo v){
        int pos = buscarVehiculo(v);
        
        if(pos >=0){
            this.listaVehiculos[pos] = null; //Borramos el vehiculo de esa posicion
        }
    }
    
    public int buscarVehiculo(Vehiculo v){
        
        //Busqueda secuencial
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if(v.equals(this.listaVehiculos[i])){
                return i;
            }
        }
        return -1;    
    }

    //nº de vehiculos que hay en el catalogo(no el tamaño del array)
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
    //Para añadir un vehiculo nuevo al array, primero buscamos si hay un espacio libre y sino 
    //creamos otro array nuevo copiando al anterior y añadiendo un espacio nuevo
    public void añadirVehiculo(Vehiculo v){
        
        //Si hay hueco, se inserta en el hueco
        if(this.numeroVehiculos<this.listaVehiculos.length){
            for (int i = 0; i < listaVehiculos.length; i++) {
                if(this.listaVehiculos[i] == null){//para elegir la posicion
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehiculo en posicion: " + i);
                    break;
                }
            }
        }else{//El array esta lleno
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, ++this.numeroVehiculos);//Array nuevo con 1 espacio mas
        }
    }
    
    public String toString(){
        
        String tmp = "";
        
        for (Vehiculo v : listaVehiculos){
            if(v!=null){
                           
                tmp += v.toString() + "\n";
            
            }
        }
        return tmp;
    }        
    
    
        
}

//Implementar metodo privado copiar
//Implementar catalogo clientes (nombre, NIF, apellidos)
