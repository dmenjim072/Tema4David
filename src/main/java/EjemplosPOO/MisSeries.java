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
        Serie house = new Serie();
        System.out.println(house);
        Serie prisonBreak = new Serie("prisonBreak", "drama", "sipnosis", "productora", 0, 0);
        System.out.println(prisonBreak);
        
        //Crear un objeto serie leyendo los datos por teclado
        Serie peakyBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakyBlinders);
        ServicioSerie.darLike(prisonBreak);
        ServicioSerie.darLike(peakyBlinders);
        System.out.println(prisonBreak);
        System.out.println(peakyBlinders);
    }
}
