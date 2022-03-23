package persona.servicios;

import entidades.persona;
import java.util.Date;
import java.util.Scanner;
import persona.entidades.entidades;

public class servicios {
    public static Scanner leer = new Scanner(System.in);
    //• Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). Este método
    //rellena el objeto mediante un Scanner y le pregunta al usuario el nombre
    //y la fecha de nacimiento de la persona a crear, recordemos que la fecha
    //de nacimiento debe guardarse en un Date y los guarda en el objeto. 
    public persona crearPersona (){
        //entidades Persona = new entidades();
        persona p = new persona();
        System.out.println("Ingrese su nombre: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese su fecha de naciemiento: ");
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fechaDeNacimiento = new Date (anio - 1900,mes,dia);
        p.setFechaNacimiento(fechaDeNacimiento);
        System.out.println(fechaDeNacimiento);
        System.out.println(p.toString());
        return p;
    }
    //• Escribir un método calcularEdad() a partir de la fecha de nacimiento
    //ingresada. Tener en cuenta que para conocer la edad de la persona también
    //se debe conocer la fecha actual. 
    public int calcularEdad(persona Persona){
        //entidades P = new entidades ();
        Date fechaActual = new Date();
        
       // System.out.println(Persona.getFechaDeNacimiento());
        int edad =  fechaActual.getYear() - Persona.getFechaNacimiento().getYear();
        return edad;
    }
    //• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en
    //caso de que el receptor tenga menor edad que la persona que se recibe
    //como parámetro, o false en caso contrario. 
    public boolean menorQue (persona p){
        boolean comprobar;
        System.out.println("Ingrese su fecha de naciemiento: ");
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int anio = leer.nextInt();
        Date fechaDeNacimientoIngresada = new Date (anio - 1900,mes,dia);
        comprobar = p.getFechaNacimiento().after(fechaDeNacimientoIngresada);
        System.out.println(comprobar);
        return comprobar;
    }
    
}
