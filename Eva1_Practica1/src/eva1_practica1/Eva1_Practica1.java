/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica1;

/**
 *
 * @author Derek
 */
public class Eva1_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona;
        persona = new Persona();
        
        persona.nombre = "Pedro";
        persona.edad = 20;
        persona.genero = "Hombre";
        persona.Inmprimir_Datos();
        System.out.println(persona);
        
        
    }
    
}
class Persona{
    String nombre;
    int edad;
    String genero;
    
    public void Inmprimir_Datos(){
        System.out.println("----DATOS DE PERSONA----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        
                
    }


}
