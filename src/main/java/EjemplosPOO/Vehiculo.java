/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosPOO;

public class Vehiculo {

    private int ruedas;
    private int peso;
    private int motor;
    private String color;
    private String marca;
    private String modelo;
    private String matricula;

    public Vehiculo() {

        
    }

    public Vehiculo(int ruedas, int peso, int motor, String color, String marca, String modelo, String matricula) {
        this.ruedas = ruedas;
        this.peso = peso;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "ruedas=" + ruedas + ", peso=" + peso + ", motor=" + motor + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }
    
}
