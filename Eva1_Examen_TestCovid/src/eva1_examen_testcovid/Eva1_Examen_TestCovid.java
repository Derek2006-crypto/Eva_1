/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_examen_testcovid;

/**
 *
 * @author Derek
 */
public class Eva1_Examen_TestCovid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test_Covid tc = new Test_Covid(false,80,70.6,1.70,60.0);
        tc.Calcular_Persona_Riesgo();
    }
    
}
