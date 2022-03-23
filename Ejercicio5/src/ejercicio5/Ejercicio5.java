package ejercicio5;
import java.util.Scanner;

/**
 * @author agust
 */
public class Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla 
    el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
    Math.sqrt().
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,res1,res2,res3;
    System.out.println("Ingrese un número");
    num = leer.nextInt();
    res1 = num*2;
    System.out.println("El dobre del número ingresado es " + res1);
    res2 = num*3;
    System.out.println("El triple del número ingresado es " + res2);
    res3 = (int) Math.sqrt(num);
    System.out.println("La raíz cuadrada del número ingresado es " + res3);
    }
    
}
