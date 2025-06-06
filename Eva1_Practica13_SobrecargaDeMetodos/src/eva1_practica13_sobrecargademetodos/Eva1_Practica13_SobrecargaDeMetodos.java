/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica13_sobrecargademetodos;

/**
 *
 * @author Derek
 */
public class Eva1_Practica13_SobrecargaDeMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO.");
        System.out.println(100);
        System.out.println(100.10);
        System.out.println(3>5);
        System.out.println("c");
        System.out.println(new Eva1_Practica13_SobrecargaDeMetodos());
        System.out.println(sumar(5,3));
        System.out.println(sumar("Hola","Mundo"));
        sumar();
    }
    
    public static int sumar(int val1,int val2){
        return val1 + val2;
    }
    
    public static String sumar(String val1,String val2){
        return val1 + val2;
    } 
    
    public static void sumar(){
        System.out.println("ESTE METODO NO HACE NADA.");
    }
    
}
