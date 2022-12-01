/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

import java.util.Objects;

/**
 *
 *Titulo, Genero(accion, comedia, scifi, drama), sipnosis, nº temporadas, productor
 * 
 * 
 */

//Declaracion de la clase
public class Serie {
    
    //Atributos de clase(static)
    
    //Atributos de instancia (no son static)
    private String titulo;
    private String genero;
    private String sipnosis;
    private String productora;
    private int numeroTemporadas;
    private int numeroLikes;

    public Serie(String titulo, String genero, String sipnosis, String productora, int numeroTemporadas, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.productora = productora;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroLikes = numeroLikes;
    }
    
    
    
    public Serie(){
        //Los atributos quedan inicializados con valores por defecto
        //Objetos apuntan a null
        //numeros a cero
        //Boolean a false
    }
    
    public Serie(String titulo, String genero, String sipnosis, String productora, int numeroTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.productora = productora;
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", productora=" + productora + ", numeroTemporadas=" + numeroTemporadas + ", numeroLikes=" + numeroLikes + '}';
    }

    public void darLike(){
        this.numeroLikes++;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.genero);
        hash = 41 * hash + Objects.hashCode(this.sipnosis);
        hash = 41 * hash + Objects.hashCode(this.productora);
        hash = 41 * hash + this.numeroTemporadas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Serie other = (Serie) obj;
        if (this.numeroTemporadas != other.numeroTemporadas) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.sipnosis, other.sipnosis)) {
            return false;
        }
        return Objects.equals(this.productora, other.productora);
    }
    
    
    
}
