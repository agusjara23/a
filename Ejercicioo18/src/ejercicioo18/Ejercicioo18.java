package ejercicioo18;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo18 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
    número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    for (int i = 0; i < 4; i++){
        System.out.println("Ingrese 4 números entre el 1 y el 20: ");
        int num;
        num = leer.nextInt();
        if (num>1 && num<20){
            System.out.print(num);
            for(int j = 0; j < num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
    
}
