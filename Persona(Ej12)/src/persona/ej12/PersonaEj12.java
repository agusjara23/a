package persona.ej12;

import entidades.persona;
import java.util.Date;
import persona.entidades.entidades;
import persona.servicios.servicios;

public class PersonaEj12 {

    /**
     * Implemente la clase Persona. Una persona tiene un nombre y una fecha de
     * nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get
     * y set. Y los siguientes métodos: Nota: encontraras un ejemplo descargable
     * de un Date como atributo en Moodle. 
     * • Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). Este método
     * rellena el objeto mediante un Scanner y le pregunta al usuario el nombre
     * y la fecha de nacimiento de la persona a crear, recordemos que la fecha
     * de nacimiento debe guardarse en un Date y los guarda en el objeto. 
     * • Escribir un método calcularEdad() a partir de la fecha de nacimiento
     * ingresada. Tener en cuenta que para conocer la edad de la persona también
     * se debe conocer la fecha actual. 
     * • Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en
     * caso de que el receptor tenga menor edad que la persona que se recibe
     * como parámetro, o false en caso contrario. 
     * • Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entidades PersonaEnt = new entidades();
        servicios PS = new servicios ();
       // PersonaServicios.crearPersona();
       // crear objeto persona
        persona p = new persona();
        // para guardar la persona creada en crearPersona 
        p = PS.crearPersona();
        //PS.calcularEdad(p);
        //Date fechaDeNacimiento = PersonaEnt.getFechaDeNacimiento();
        System.out.println("Edad: " + PS.calcularEdad(p));
        //System.out.println(PersonaServicios.menorQue(0));
        int edadPersonaCreada = PS.calcularEdad(p);
        PS.menorQue(p);
    }
}
