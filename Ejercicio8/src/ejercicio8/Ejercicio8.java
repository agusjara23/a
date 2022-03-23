package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio8 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
    investigar la función equals() en Java.

     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String palabra,clave;
    clave = "eureka";
    System.out.println("Ingrese una palabra");
    palabra = leer.next();
    if (palabra.equals(clave)){
    System.out.println("Correcto");
    }else{
        System.out.println("Incorrecto");
    }
    
    
    }
    
}
