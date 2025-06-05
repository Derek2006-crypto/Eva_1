package eva1_practica.pkg8_constructores;







/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class Vehiculos {
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    
    public Vehiculos() {
        this.marca = "---";
        this.modelo = "---";
        this.precio = 0.0;
        this.year = 0;
        this.color = "---";
    }

    public Vehiculos(String marca, String modelo, double precio, int year, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.year = year;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    public void Imprimir_VEHICULO(){
        System.out.println("----DATOS DEL VEHICULO----");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
    }
    
}
