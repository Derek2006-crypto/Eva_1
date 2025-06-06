/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica12_calculadora;

/**
 *
 * @author Derek
 */
public class Eva1_Practica12_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(suma(1,2));
        System.out.println(resta(10,5));
        System.out.println(multiplicacion(5,5));
        System.out.println(division(10,2));
        System.out.println(potencia(2,2));  
    }
    
    public static int suma(int n1,int n2){
            int resu;
            resu = n1 + n2;
            return resu;
        }
    
    public static int resta(int n1,int n2){
        int resu;
        resu = n1 - n2;
        return resu;
    }
    
    public static int multiplicacion(int n1,int n2){
        int resu;
        resu = n1 * n2;
        return resu;
    }
    
    public static int division(int n1,int n2){
        int resu;
        resu =  n1/n2;
        return resu;
    }
    
    public static int potencia(int n1,int n2){
        int resu = 1;
        for(int i = 0; i < n2; i++){
            resu *= n1;
        }
        return resu;
    }
}
