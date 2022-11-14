/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class ServicioSerie {
    
    private static Scanner teclado = new Scanner(System.in);
    
    //Lee por teclado los datos de una serie y devuelve el objeto creado
    public static Serie leerTecladoSerie(){
        
        //Creamos el objeto de tipo Serie
        Serie serie;
        
        //Leer por teclado e instanciar      
        System.out.println("Nombre de la serie");
        String nombreSerie = teclado.nextLine();
        System.out.println("Genero de la serie");
        String generoSerie = teclado.nextLine();
        System.out.println("Productora de la serie");
        String productoraSerie = teclado.nextLine();
        System.out.println("Numero temporadas de la serie");        
        int temporadasSerie = teclado.nextInt();
        System.out.println("Sipnosis de la serie");
        String sipnosisSerie = teclado.nextLine();
        System.out.println("Numero likes de la serie");
        int likesSerie = teclado.nextInt();
        
        teclado.nextLine();
       
        //Instanciamos 
        serie = new Serie(nombreSerie, generoSerie, sipnosisSerie, productoraSerie, temporadasSerie, likesSerie);
        
        //Devolvemos el tipo Serie
        return serie;
    }
    
    public static void darLike(Serie serie){
        
        System.out.println("Te ha gustado la serie" + serie.getTitulo() + "?");
        String respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("si")){
            serie.darLike();
        }
    }
}
