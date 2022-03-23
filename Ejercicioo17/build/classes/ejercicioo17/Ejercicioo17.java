package ejercicioo17;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo17 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
     si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * * 
    *     *
    *     *
    * * * *
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num;
    System.out.println("Ingrese un número");
    num = leer.nextInt();
    for ( int i  = 0; i < num; i++){
        System.out.print("* ");                                                             
    }for (int n=0;n < num-1; n++){
            System.out.println("* ");
        }   
    
    }
    
}
