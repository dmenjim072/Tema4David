/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEnum;

/**
 *
 * @author david
 */
public class Test {
    
    public static void main(String[] args) {
        
        EstadoAnimal estadoPerro = EstadoAnimal.COMIENDO;
        System.out.println("Estado perro tiene de codigo " + estadoPerro.getCodigoEstado());
        System.out.println("Estado perro tiene de descripcion " + estadoPerro.getEstado());
        
        
    }
    
}
