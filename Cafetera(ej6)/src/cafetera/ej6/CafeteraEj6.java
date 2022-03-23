package cafetera.ej6;

import cafeteraej6.entidades.entidades;
import cafeteraej6.servicios.servicios;
import java.util.Scanner;
public class CafeteraEj6 {
     public static Scanner leer = new Scanner(System.in);
    /**
     * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
    capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
    cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
    menos, los siguientes métodos: 
   • Constructor predeterminado o vacío
   • Constructor con la capacidad máxima y la cantidad actual
   • Métodos getters y setters.
   • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
   máxima. 
   • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
   tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
   cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
   método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
   cuanto quedó la taza.
   • Método vaciarCafetera(): pone la cantidad de café actual en cero. 
   • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
   recibe y se añade a la cafetera la cantidad de café indicada.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entidades c1 = new entidades ();
        servicios Cafetera = new servicios ();
       Cafetera.capMax(c1);
        System.out.println("Ingrese la acción que desea realizar con la cafetera: ");
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar café a la cafetera");
        int opc = leer.nextInt();
        switch (opc) {
            case 1: 
               Cafetera.llenarCafetera(c1);
               break;
            case 2:
                Cafetera.servirTaza(c1);
                break;
            case 3:
                Cafetera.vaciarCafetera(c1);
                break;
            case 4:
                Cafetera.agregarCafe(c1);
                break;
        }
    }
    
}
