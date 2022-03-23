package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio7 {

    /**
     * 
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,resultado;
    System.out.println("Ingrese un número");
    num = leer.nextInt();
    resultado = num%2;
    switch (resultado) {
        case 0:
            System.out.println("El número es par");
            break;
        default:
            System.out.println("El número es impar");
    }

    }
    
}
