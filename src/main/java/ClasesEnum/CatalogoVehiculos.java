/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEnum;

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
        
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if(v.equals(this.listaVehiculos[i])){
                return i;
            }
        }
        return -1;    
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
    
    
    
}
