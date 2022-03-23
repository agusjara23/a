
package ejer.easy;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicio1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado 
     * y calcule la suma de los dos. 
     * El programa deberá después mostrar el resultado de la suma
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner leer = new Scanner(System.in);
     int número1,número2,resultado;
     System.out.println("Ingrese dos números enteros");
     System.out.println("Ingrese el primer número entero");
        número1 = leer.nextInt();
     System.out.println("Ingrese el segundo número entero");
        número2 = leer.nextInt();
     resultado=número1+número2;
     System.out.println("El resultado de la suma es " + resultado );
    }
    
}
