/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_examen_testcovid;

/**
 *
 * @author Derek
 */
public class Test_Covid {
    private boolean Enfermedad_Cronica;
    private int edad;
    private double peso;
    private double altura;
    private double mts;
    
    public Test_Covid() {
        this.Enfermedad_Cronica = false;
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.mts = 0.0;
    }


    public Test_Covid(boolean Enfermedad_Cronica, int edad, double peso, double altura, double mts) {
        this.Enfermedad_Cronica = Enfermedad_Cronica;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.mts = mts;
    }

    public boolean isEnfermedad_Cronica() {
        return Enfermedad_Cronica;
    }

    public void setEnfermedad_Cronica(boolean Enfermedad_Cronica) {
        this.Enfermedad_Cronica = Enfermedad_Cronica;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMts() {
        return mts;
    }

    public void setMts(double mts) {
        this.mts = mts;
    }
    
    private double Calcular_IMC(){
        double mts = altura/100;
        return(peso/(mts*mts));
    }
    
    public String Calcular_Persona_Riesgo(){
        if(edad >= 65){
            System.out.println("¡PERSONA DE RIESGO!");
        }else if(Enfermedad_Cronica == true){
            System.out.println("¡PERSONA DE RIESGO!");
        }else if(Calcular_IMC() >= 30){
            System.out.println("¡PERSONA DE RIESGO!");
        }else{
            System.out.println("Persona sin riesgo");
        }
        return null;
    }
    
    
}
