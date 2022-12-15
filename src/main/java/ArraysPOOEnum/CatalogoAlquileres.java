/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEnum;

import java.util.Arrays;

/**
 *
 * @author david
 */
public class CatalogoAlquileres {
    
    private int numeroAlquileres;
    private Alquileres[] listaAlquileres;
    
    //Constructor dando tamaño
    public CatalogoAlquileres(int numeroAlquileres, Alquileres[] listaAlquileres, int tamaño) {
        
        tamaño = Math.abs(tamaño);//Para pasarlo a positivo
        
        this.numeroAlquileres = numeroAlquileres;
        this.listaAlquileres = listaAlquileres;
    }
        
    //Getters y Setters
    public int getNumeroAlquileres() {
        return numeroAlquileres;
    }

    public void setNumeroAlquileres(int numeroAlquileres) {
        this.numeroAlquileres = numeroAlquileres;
    }

    public Alquileres[] getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(Alquileres[] listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    @Override
    public String toString() {
        return "CatalogoAlquileres{" + "numeroAlquileres=" + numeroAlquileres + ", listaAlquileres=" + listaAlquileres + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numeroAlquileres;
        hash = 29 * hash + Arrays.deepHashCode(this.listaAlquileres);
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
        final CatalogoAlquileres other = (CatalogoAlquileres) obj;
        if (this.numeroAlquileres != other.numeroAlquileres) {
            return false;
        }
        return Arrays.deepEquals(this.listaAlquileres, other.listaAlquileres);
    }
    
    
    
}



