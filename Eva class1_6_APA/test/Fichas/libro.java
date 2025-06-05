package Fichas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Derek
 */
public class libro {
    private String autor;
    private String titulo;
    private int año;
    private String ciudad;
    private String editorial;
    //CONSTRUCTORES
    //METODOS
    //metodos get y set
    public String getautor(){
        return autor;
    }
    public void setautor(String valor){
        autor = valor;
    }
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String valor){
        titulo = valor;
    }
    public int getaño(){
        return año;
    }
public void setaño(int valor){
    año = valor;
}
public String ciudad (){
    return ciudad;
}
public void setciudad(String valor){
    ciudad = valor;
}
public String editorial(){
    return editorial;
}
public void seteditorial( String valor){
    editorial = valor;
}
public void imprimirRefrencia(){
    System.out.println(autor + "(" + año + "). "+ titulo +"," + ciudad + ","+ editorial);
 }
    }

