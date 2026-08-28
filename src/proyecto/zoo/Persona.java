/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
//Creación superclase Persona
public class Persona{
    //Creación de atrubutos de la super clase Persona
    private String id="";
    private String nombre="";
    private int edad=0;
    private String genero="";
    private String celular="";

    
    //Crear constructor vacio
    public Persona(){}
    //Creación de un constructor con un parametro
    public Persona(String id){
        this.id=id;
    }
    public void ingreso(){
        System.out.println(nombre + " ingresó");
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getEdad(){
        return edad;
    
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
   
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getCelular(){
        return celular;
    }
    public void setCelular(String celular){
        this.celular= celular;
    }
   
   
    
    
    
}
