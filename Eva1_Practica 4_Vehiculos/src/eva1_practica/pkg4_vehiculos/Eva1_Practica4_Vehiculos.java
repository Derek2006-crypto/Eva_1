/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica.pkg4_vehiculos;

import java.util.Scanner;
/**
 *
 * @author Derek
 */
public class Eva1_Practica4_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        vehiculos autos = new vehiculos();
        
        System.out.println("Marca del vehiculo: ");
        String cade = captu.nextLine();
        autos.setMarca(cade);
        
        System.out.println("Modelo del vehiculo: ");
        cade = captu.nextLine();
        autos.setModelo(cade);
        
        System.out.println("Precio del vehiculo: ");
        cade = captu.nextLine();
        double precio = Double.parseDouble(cade);
        autos.setPrecio(0);
        
        System.out.println("Año del vehiculo: ");
        cade = captu.nextLine();
        autos.setYear(0);
        
        System.out.println("Color del vehiculo: ");
        cade = captu.nextLine();
        autos.setColor(cade);
        
        autos.Imprimir_Datos_Vehiculos();
        
        
        
        
        
        
        
        
        
        
    }
    
}
