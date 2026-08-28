/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
 //Crear clase hija Cliente
//Aplicación de la herencia de la subclase Cliente con la superclase Persona
public class Cliente extends Persona{
    private String fechaIngreso;
    private String fechaSalida;
    
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso=fechaIngreso;
    
    }
    
    public String getFechaSalida(){
        return fechaSalida;
    }
    public void setFechaSalida(String fechaSalida){
        this.fechaSalida=fechaSalida;
    
    }
   
    
}
