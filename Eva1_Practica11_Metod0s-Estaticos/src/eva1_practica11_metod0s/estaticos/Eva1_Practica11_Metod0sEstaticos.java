/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica11_metod0s.estaticos;

/**
 *
 * @author Derek
 */
public class Eva1_Practica11_Metod0sEstaticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor_Aleatorio = Math.random();
        int valor = (int)(valor_Aleatorio * 1000);
        System.out.println(valor_Aleatorio);
        System.out.println(valor);
        
        System.out.println(Temperaturas.convertir_FaC(100));
        System.out.println(Temperaturas.convertir_CaF(100));
        System.out.println(Temperaturas.convertir_CaK(100));
        System.out.println(Temperaturas.convertir_KaC(100));
        System.out.println(Temperaturas.convertir_FaK(100));
        System.out.println(Temperaturas.convertir_KaF(100));
    }
    
}
