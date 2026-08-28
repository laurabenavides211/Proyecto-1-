/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
public class Empleado extends Persona{
    private String cargo;
    private String horario;
    
    public Empleado(){}
    public Empleado(String cargo){
        this.cargo=cargo;
    }
    public Empleado(String cargo, String nombre){
        super(nombre);
        this.cargo=cargo;
        
    }


    
    
    public Empleado (String cargo, String horario, String id, String nombre, int edad, String genero, String celular){
        super(id,nombre, edad, genero, celular);
        this.cargo=cargo;
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
