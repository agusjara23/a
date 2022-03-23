package ejercicioo14;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo14 {

    /**
     * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
    salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
    deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
    número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,suma;
    suma = 0;
    for ( int i  = 0; i < 21; i++) {
        System.out.println("Ingrese un número");
        num = leer.nextInt(); 
        suma = suma + num;
        if (num == 0 ){
            System.out.println("Se capturó el número 0");
        } 
        if (num < 0){
        break;
        }
        System.out.println("La suma de los números es " + suma);
    }
   } 
}
