/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva.class1_6_apa;

/**
 *
 * @author Derek
 */
public class SitioWeb {
    public class EvaClass1_6_APA {
    private String nombre;
    private String mes;
    private int año;
    private String dia;
    private String url;
    //CONSTRUCTORES
    //METODOS
    //metodos get y set
    public String getnombre(){
        return nombre;
    }
    public void setautor(String valor){
        nombre = valor;
    }
    public String getmes(){
        return mes;
    }
    public void setmes(String valor){
        mes = valor;
    }
    public int getaño(){
        return año;
    }
public void setaño(int valor){
    año = valor;
}
public String dia (){
    return dia;
}
public void setdia(String valor){
    dia = valor;
}
public String url(){
    return url;
}
public void seturl( String valor){
    url = valor;
}
public void imprimirRefrencia(){
    System.out.println(nombre + "(" + año +"). " + mes +"," + dia +"," + url);
    
}
    }

    }