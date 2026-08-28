/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.zoo;

/**
 *
 * @author uestudiantes
 */
public class ProyectoZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona3=new Persona("PER 03","Laura ");
        System.out.println(persona3.getNombre()+ persona3.getId());
        
        Empleado empleado2=new Empleado("Veterinario ", "Jose");
        System.out.println(empleado2.getCargo()+ empleado2.getNombre());
        Cliente cliente2 =new Cliente("27/08/2026 9:00am", "27/08/2026 4:30pm", "Liam Camilo");
        System.out.println(cliente2.getFechaIngreso()+ " "+ cliente2.getFechaSalida() +" " +cliente2.getNombre());
        

        Persona persona1 = new Persona();
        persona1.getNombre();
        persona1.setNombre("Julio");
        persona1.setEdad(25);
        persona1.setGenero("Masculino");
        persona1.setCelular("3001234567");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Celular: " + persona1.getCelular());
        persona1.ingreso();
        

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos");
        empleado1.setCargo("veterianario");
        empleado1.setHorario("7:30 am a 4:30pm");

        empleado1.ingreso();
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("Horario laboral: " + empleado1.getHorario());

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Hernando Perez");
        cliente1.setEdad(22);
        cliente1.setGenero("Masculino");
        cliente1.setCelular("+57 301 1234567");
        cliente1.setFechaIngreso("24/08/2026");
        cliente1.setFechaSalida("24/08/2026");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Genero: " + cliente1.getGenero());
        System.out.println("Celular: " + cliente1.getCelular());
        System.out.println("Fecha ingreso: " + cliente1.getFechaIngreso());
        System.out.println("Fecha salida: " + cliente1.getFechaSalida());

        Animal animal1 = new Animal();
        animal1.id = "A01";
        animal1.nombre = "Lola";
        animal1.edad = 2;

        System.out.println("ID: " + animal1.id);
        System.out.println("Nombre: " + animal1.nombre);
        System.out.println("Edad: " + animal1.edad);

        Raza raza1 = new Raza();

        raza1.id = "R01";
        raza1.nombre = "Perro";
        raza1.edad = 3;
        raza1.tipoRazaAnimal = "Labrador";

        System.out.println("ID: " + raza1.id);
        System.out.println("Nombre: " + raza1.nombre);
        System.out.println("Edad: " + raza1.edad);
        System.out.println("Raza: " + raza1.tipoRazaAnimal);

        Tipo_Alimento alimento1 = new Tipo_Alimento();

        alimento1.id = "AL01";
        alimento1.nombre = "León";
        alimento1.edad = 5;
        alimento1.tipoAlimento = "Carne";

       
        System.out.println("ID: " + alimento1.id);
        System.out.println("Animal: " + alimento1.nombre);
        System.out.println("Alimento: " + alimento1.tipoAlimento);

        Planta planta1 = new Planta();

        planta1.setId("P001");
        planta1.setNombre("Rosa");

        System.out.println("ID: " + planta1.getId());
        System.out.println("Nombre: " + planta1.getNombre());

        Tipo_Planta planta2 = new Tipo_Planta();

        planta2.setId("P01");
        planta2.setNombre("Orquídea");
        planta2.setEspeciePlanta("Ornamental");

        System.out.println("ID: " + planta2.getId());
        System.out.println("Nombre: " + planta2.getNombre());
        System.out.println("Especie: " + planta2.getEspeciePlanta());

        Clasificacion clasificacion1 = new Clasificacion();

        clasificacion1.setId("P003");
        clasificacion1.setNombre("Pino");
        clasificacion1.setClasificacion("Árbol");

        System.out.println("ID: " + clasificacion1.getId());
        System.out.println("Nombre: " + clasificacion1.getNombre());
        System.out.println("Clasificación: " + clasificacion1.getClasificacion());

    }

}
