package Personaej7.servicios;
import java.util.Scanner;
import Personaej7.entidades.entidades;
import static java.lang.Math.pow;

public class servicios {
    public static Scanner leer = new Scanner(System.in);
   // • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
   // al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
   // Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
   // O. Si no es correcto se deberá mostrar un mensaje
    public entidades crearPersona (){
        entidades Persona = new entidades();
        System.out.println("Ingrese su nombre: ");
        Persona.setNombre(leer.next());
        System.out.println("Ingrese su apellido: ");
        Persona.setApellido(leer.next());
        System.out.println("Ingrese su edad: ");
        Persona.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo con una letra: ");
        Persona.setSexo(leer.next());
        if ((Persona.getSexo().equalsIgnoreCase("H")) || (Persona.getSexo().equalsIgnoreCase("M")) || (Persona.getSexo().equalsIgnoreCase("O"))){
            System.out.println("Correcto");
         }else{
            System.out.println("Incorrecto. Intente de nuevo");
            Persona.setSexo(leer.next());
        }
        System.out.println("Ingrese su peso: ");
        Persona.setPeso(leer.nextInt());
        System.out.println("Ingrese su altura: ");
        Persona.setAltura(leer.nextDouble());
        return Persona;
    }
   // • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
   // kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
   // que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
   // fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
   // está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
   // fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
   // función devuelve un 1.
    public int calcularIMC(entidades Persona){
        double IMC;
        int resultadoIMC = 0;
        //Peso (kg) / [estatura (m)]2
        IMC = (Persona.getPeso()/(pow(Persona.getAltura(),2.0)));
        if (IMC < 20) {
            resultadoIMC = -1;
        }if (IMC > 20 && IMC < 25){
                resultadoIMC = 0;
        }if (IMC > 25){
            resultadoIMC = 1;
        }
        int valorResultado = resultadoIMC;
        return resultadoIMC;
    }
   // • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
   // devuelve un booleano.
    public boolean esMayordeEdad (entidades Persona){
        int añoActual = 2022;
        int prueba; 
        prueba = (Persona.getEdad());
        if (prueba >= 18){
            boolean MayordeEdad = true;
            return MayordeEdad;
        } else {
            boolean MayordeEdad = false;
            return MayordeEdad;
        }
    }
    
    
    
    
}



