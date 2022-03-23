package date.ej11;

import date.entidades.entidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEj11 {
    public static Scanner leer = new Scanner(System.in);
    /**
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar
     * solo con la clase Date. En este ejercicio deberemos instanciar en el
     * main, una fecha usando la clase Date, para esto vamos a tener que crear 3
     * variables, dia, mes y anio que se le pedirán al usuario para poner el
     * constructor del objeto Date. Una vez creada la fecha de tipo Date,
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha
     * actual, que se puede conseguir instanciando un objeto Date con
     * constructor vacío. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: Date fechaActual = new Date(); Si necesiten acá
     * tienen más información en clase Date: Documentacion Oracle
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entidades ent = new entidades();
        int anio;
        int mes;
        int dia;
        System.out.println("Ingrese un día: ");
        dia = leer.nextInt();
        
        System.out.println("Ingrese un mes: ");
        mes = leer.nextInt();
        
        System.out.println("Ingrese un año: ");
        anio = leer.nextInt();
        
        Date fechaFinal = new Date(anio - 1900,mes,dia);
        System.out.println(fechaFinal);
      
        Date fechaActual = new Date();
        System.out.println("La diferencia de años es: " + (fechaActual.getYear() - fechaFinal.getYear()));
        
        
        
    }
    
}
