/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica.pkg4_vehiculos;

/**
 *
 * @author Derek
 */
public class vehiculos {
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;

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
    
    
    public void Imprimir_Datos_Vehiculos(){
        System.out.println("----DATOS DEL VEHICULO----");
        System.out.println("MARCA: "+ marca);
        System.out.println("MODELO: "+ modelo);
        System.out.println("AÑO: "+ year);
        System.out.println("COLOR: "+ color);
        System.out.println("PRECIO. "+ precio);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
