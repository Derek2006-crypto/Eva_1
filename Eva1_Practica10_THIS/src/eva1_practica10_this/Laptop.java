/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica10_this;

/**
 *
 * @author Derek
 */
public class Laptop {
    private String procesador;
    private double memoria;
    private double disco_duro;
    private double pantalla;
    private String marca;
    private String modelo;
    
    public Laptop() {
        this.procesador = "---";
        this.memoria = 0.0;
        this.disco_duro = 0.0;
        this.pantalla = 0.0;
        this.marca = "---";
        this.modelo = "---";
    }

    public Laptop(String procesador, double memoria, double disco_duro, double pantalla, String marca, String modelo) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.disco_duro = disco_duro;
        this.pantalla = pantalla;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(double disco_duro) {
        this.disco_duro = disco_duro;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
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
    
    public void Imprimir_Datos_Laptop(){
    System.out.println("Marca: " +marca);
    System.out.println("Modelo: " +modelo);
    System.out.println("Procesador: " +procesador);
    System.out.println("Disco duro: " +disco_duro);
    System.out.println("Pantalla: " +pantalla);
    
    
    }
    
    
    
    
    
}
