package ejercicioo24;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo24 {

    /**
     * . Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
    que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
    cambiada de signo. Es decir, A es anti simétrica si A = -AT
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
    * sus filas por columnas (o viceversa).
    * Matriz     Matriz traspuesta
    * 0 -2  4    0  2 -4
    * 2  0  2   -2  0 -2
    *-4 -2  0    4  2  0
    * 
    * En este caso la matriz es anti simétrica.
    * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n;
    System.out.println("Ingrese el tamaño de la matriz: ");
    n = leer.nextInt();
    int [][] matriz = new int [n][n]; 
    
    }
    
}
