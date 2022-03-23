package ejercicioo13;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo13 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
     solicite números al usuario hasta que la suma de los números introducidos supere el 
     límite inicial. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int lim,num1,num2,suma;
    do{
      System.out.println("Ingrese un valor límite positivo");
        lim = leer.nextInt();  
    }while (lim<0);
    do{
      System.out.println("Ingrese un número");
      num1 = leer.nextInt();
      num2 = leer.nextInt();
      suma = num1 + num2;
    }while (suma<lim); 
      
    }         
    }


