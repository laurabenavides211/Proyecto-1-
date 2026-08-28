/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
 //Creación de la subclase Empleado 
//Aplicación de la herencia de la subclase Empleado con la superclase Persona
public class Empleado extends Persona{
    //Creación de atrubutos privados de la subclase Empleado
    private String cargo;
    private String horario;
    //Creación de constructor vacio de la subclase Empleado
    public Empleado(){}
    //Creación de un constructor con un parametro
    public Empleado(String cargo){
        this.cargo=cargo;
    }
    //Creción de un constructor con dos parametros 
    public Empleado(String cargo, String nombre){
        super(nombre);
        this.cargo=cargo;
        
    }
    public Empleado(String nombre, String cargo,  String horario){
        super(nombre);
        this.cargo= cargo;
        this.horario=horario;
    }

    
    public String getCargo(){
        return cargo;
        
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    
    }
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    
}
