package ejercicioo19;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
/**
 *
 * @author agust
 */
public class Ejercicioo19 {

    /**
     * 
    Crea una aplicación que a través de una función nos convierta una cantidad de 
    euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
    libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
    converir que será una cadena, este no devolverá ningún valor y mostrará un 
    mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una cantidad de euros para cambiarlos:");
    int euros;
    String tipo,tipo1;
    euros = leer.nextInt();
    System.out.println("Ingrese el tipo de moneda que desea cambiar(dólares/yenes/libras):");
    tipo = leer.next();
    tipo1 = toLowerCase(tipo);
    cambio(euros,tipo);
    }
       public static void cambio(int euros,String tipo){
           switch(tipo){
               case "dolares":
                   double dolar = 1.28611*euros;
                   System.out.println("La conversión a dólares es "+dolar);
                   break;
               case "yenes":
                   double yenes = 129.852*euros;
                   System.out.println("La conversión a yenes es "+yenes);
                   break;
               case "libras":
                   double libra = 0.86*euros;
                   System.out.println("La conversión a libras es "+libra);
                   break;
           }
       }

    
                
    
    
}
