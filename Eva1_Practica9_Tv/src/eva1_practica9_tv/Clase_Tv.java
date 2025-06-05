/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_practica9_tv;

/**
 *
 * @author Derek
 */
public class Clase_Tv {
    private boolean encendido;
    private int volumen;
    private int canal;

    public Clase_Tv(){
        encendido = true;
        volumen = 10;
        canal = 3;
    }
    
    public Clase_Tv(boolean encendido, int volumen, int canal) {
        this.encendido = encendido;
        this.volumen = volumen;
        this.canal = canal;
    }
    
    public void Encender_Apagar(){
        if(encendido == true)
            encendido = false;
        else
            encendido = true;
    }
    public void Imprimir_Datos_TV(){
        if(encendido == true)
            System.out.println("TV ENCENDIDA");
        else
            System.out.println("TV APAGADA");
        
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
    }
    
    public void Subir_Volumen(){
        if(volumen < 100)
            
            if(encendido == true)
                System.out.println("TV ENCENDIDA");
        else
                System.out.println("TV APAGADA");
        
        System.out.println("Volumen: " + volumen);
        volumen += 1;
                }
    
    public void Bajar_Volumen(){
        if(volumen > 0)
            volumen -= 1;
        
        if(encendido == true)
            System.out.println("TV ENCENDIDA");
        else
            System.out.println("TV APAGADA");
        
        System.out.println("Volumen: " + volumen);
    }
    
    public void Mas_Canal(){
        if(encendido == true){
            if(canal == 10){
                canal = 0;
            }else
                canal += 1;
            }
    }
    
    public void Menos_Canal(){
        if(encendido == true){
            if(canal == 0){
                canal = 10;
            }else
                canal -= 1;
            }
    }
    
    public void setCanal(int valor){
        canal = valor;
        
    }
    
    
            
    
    

    
}
