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
    private String cargo="";
    private String horario="";
    
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
