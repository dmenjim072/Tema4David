/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEnum;

/**
 *
 * @author david
 */
public class CatalogoClientes {
    
    private int numeroClientes;
    private Clientes[] listaClientes;//Creamos un array de clientes

    //Metodo para dar tamaño
    public void darTamañoClientes(int tamaño){
        
        tamaño = Math.abs(tamaño);//Para pasarlo a positivo
        
        this.numeroClientes = tamaño;
        this.listaClientes = new Clientes[tamaño];
        
    }
    
    //Metodo para añadir clientes al catalogo
    public void añadirClientes(Clientes x){
        
        //Si hay hueco se inserta en el hueco
        if(this.numeroClientes<listaClientes.length){
            
            for (int i = 0; i < listaClientes.length; i++) {//Recorremos el array para añadirle clientes al catalogo
                this.listaClientes[i] = new 
            }
        }
        
    } 
    

    
}
