package ejercicio3;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
  después toda en minúsculas. Nota: investigar la función toUpperCase() y 
  toLowerCase() en Java.
 * @author agust
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String frase;
    String may;
    String min;
    System.out.println("Ingrese una frase");
    frase = leer.next();
    may = toUpperCase(frase);
    System.out.println(may);
    min = toLowerCase(frase);
    System.out.println(min);
    }
    
}
