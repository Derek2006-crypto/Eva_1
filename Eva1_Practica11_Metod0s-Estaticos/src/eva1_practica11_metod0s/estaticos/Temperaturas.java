/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica11_metod0s.estaticos;

/**
 *
 * @author Derek
 */
public class Temperaturas {
    
    private Temperaturas(){}
    
    public static double convertir_FaC(double fa){
        double resu;
        resu = (fa - 35) * (5.0/9.0);
        return resu;
    }
    
    public static double convertir_CaF(double ce){
        double resu;
        resu = (ce * (9.0/5.0)) + 32;
        return resu;
    }
    
    public static double convertir_CaK(double ce){
        double resu;
        resu = ce + 273.15;
        return resu;
    }
    
    public static double convertir_KaC(double ke){
        double resu;
        resu = ke - 273.15;
        return resu;
    }
    
    public static double convertir_FaK(double fe){
        double resu;
        resu = ((5.0/9.0)*(fe-32))+273.15;
        return resu;
    }
    
    public static double convertir_KaF(double ke){
        double resu;
        resu = ((1.8)*(ke-273.15))+32;
        return resu;
    }
    
    
    
    
    
    
    
    
}
