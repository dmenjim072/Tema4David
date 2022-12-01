/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

/**
 *
 * @author david
 */
public class MisSeries {
    
    public static void main(String[] args) {
        
        Serie simpson = new Serie("Los simpson", "Comedia", "...", "Fox", 1000);
        System.out.println(simpson);
        Serie house = new Serie("house", "drama", "..", "asd", 5, 0);
        
        Serie simpsons2 = ServicioSerie.copiar(simpson); //Creamos simpsons2
        
        
        System.out.println("Son iguales simpson y simpsons2?" + simpson.equals(simpsons2));//Comparamos simpsons con simpsons2
        
        
        
        System.out.println(house);
        Serie prisonBreak = new Serie("prisonBreak", "drama", "sipnosis", "productora", 0, 0);
        System.out.println(prisonBreak);
        
        ServicioSerie.darLike(house);
        System.out.println(house);
        
        //Crear un objeto serie leyendo los datos por teclado
        Serie peakyBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakyBlinders);
        ServicioSerie.darLike(prisonBreak);
        ServicioSerie.darLike(peakyBlinders);
        
        System.out.println(prisonBreak);
        System.out.println(peakyBlinders);
    }
    
    
    
    
    
}
