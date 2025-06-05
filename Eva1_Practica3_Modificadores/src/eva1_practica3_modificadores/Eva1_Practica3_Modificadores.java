/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica3_modificadores;

/**
 *
 * @author Derek
 */
public class Eva1_Practica3_Modificadores {

    /**.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Derek");
        persona.setApellido("Aguilar");
        persona.setEdad(18);
        persona.setGenero("Masculino");
        persona.setCurp("2004597");
        
        System.out.println("----MOSTRAR DATOS DE PERSONA----");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getApellido());
        System.out.println("Genero: " + persona.getGenero());
        System.out.println("CURP: " + persona.getCurp());
        
        
        
        
    }
    
}
