/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica10_this;

/**
 *
 * @author Derek
 */
public class Eva1_Practica10_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Derek","Aguilar",18);
        Laptop lap = new Laptop("AMD-A4",1.6,275,9.8,"HP","Series X");
        persona.Imprimir_Datos_Persona();
        lap.Imprimir_Datos_Laptop();
    }
    
}
