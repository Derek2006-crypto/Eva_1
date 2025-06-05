/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ventas;
import Fichas.libro;
/**
 *
 * @author Derek
 */
public class EvaClass1_6_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Libro");
        libro Libro = new libro();
        Libro.getautor();
        Libro.getaño();
        Libro.gettitulo();
        Libro.imprimirRefrencia();
      Libro.setautor("Quijote");
      Libro.setciudad("toluca");
      Libro.seteditorial("juventud");
      Libro.settitulo("Coco");
      Libro.setaño(2006);
        
    }
    
}
