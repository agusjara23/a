package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicio4 {
    /**
     * 
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
       grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int c;
    int f;
    System.out.println("Ingrese grados centígrados");
    c = leer.nextInt();
    f = 32 + (9*c/5);
    System.out.println("En grados Fahrenheit es " + f);
    }
    
}
