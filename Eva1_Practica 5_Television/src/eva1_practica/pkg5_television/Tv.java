package eva1_practica.pkg5_television;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class Tv {
    private boolean encendido;
    private int volumen;
    private int canal;
    
    public void encender_Apagar(){
        if (encendido == true)
            encendido = false;
        else
        encendido = true;
    }
    
    public void Imprimir_Datos(){
        if (encendido == true)
            System.out.println("TV ENCENDIDA");
        else
            System.out.println("TV APAGADA");
        
        System.out.println("VOLUMNE: " + volumen);
        System.out.println("Canal: " + canal);                                
    }
    
    public void subir_Volumen(){
        if (volumen < 100)
            
            if (encendido == true)
                System.out.println("TV ENCENDIDA");
        else
                System.out.println("TV APAGADA");
        System.out.println("Volumen. " + volumen);
        volumen += 1;
    }
    
    public void bajar_Volumen(){
        if (volumen > 0)
            volumen -= 1;
        
        if(encendido == true)
            System.out.println("TV encendida");
        else
            System.out.println("TV apagada");
        
        System.out.println("Volumen: " + volumen);
    }
    
    public void mas_Canal(){
        if (encendido == true){
            if (canal == 10){
                canal = 0;
            }else
                canal += 1;
        }
          }
    public void menos_Canal(){
        if (encendido == true){
            if (canal == 0){
                canal = 10;
            }else
                canal -= 1;
        }
    }
    
    public void set_Canal(int valor){
        canal = valor;
    }
    
    
    
    
    
    
    
    
    
    
    
}





