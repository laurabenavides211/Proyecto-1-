/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
public class Persona{
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String celular;

    public Persona(){}
    public Persona(String id){
        this.id=id;
    }
    public Persona(String id, String nombre){
        this.id=id;
        this.nombre=nombre;
                
    }   
    public Persona(String nombre, int edad, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
    }
    public Persona(String id, String nombre, int edad, String celular){
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.celular=celular;
    }
    public Persona(String id, String nombre, int edad, String genero, String celular){
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.celular=celular;
    
    }
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id= id;
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
    public void ingreso(){
        System.out.println(nombre + " ingresó");
    }
   
   
    
    
    
}
