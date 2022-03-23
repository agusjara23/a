package ejercicio6;
import java.util.Scanner;

/**
 * @author agust
 */
public class Ejercicio6 {

    /**
     * Implementar un programa que dado dos números enteros determine cuál es el 
       mayor y lo muestre por pantalla 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1,num2;
    System.out.println("Ingrese dos números enteros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    if (num1>num2){
        System.out.println("El número mayor es " + num1);
    } else {
        System.out.println("El número mayor es " + num2);
    } 
    
    
    
    
    
    
    
    }
    
}
