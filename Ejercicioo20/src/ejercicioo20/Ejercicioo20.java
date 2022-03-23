package ejercicioo20;

/**
 *
 * @author agust
 */
public class Ejercicioo20 {

    /**
     * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
    los muestre por pantalla en orden descendente.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] vector = new int [100];
    for (int i = 0; i < 100; i++) {
        vector[i] = i;
        System.out.print("[" + vector[i] + "]");
    }
    System.out.println();
    for (int i = 99 ; i > 0; i--){
        System.out.print("[" + vector[i] + "]");
    }
} 
}
