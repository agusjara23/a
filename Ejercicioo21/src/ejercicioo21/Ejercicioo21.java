package ejercicioo21;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo21 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
    pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
    encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int [] vector = new int [20];
    int num,pos=0,acu=0,rep=0;
    for (int i = 0; i < 20; i++) {
        vector[i] = (int) (Math.random() * 10);
    }
    System.out.println("Ingrese un número que desea buscar");
    num = leer.nextInt();
    for (int i = 0; i < 20; i++){
    if (vector[i]==num){
        acu = acu + 1;
        pos = i;
    }
    rep = rep + 1;
    }
    if (acu!=0){
    System.out.println("Número encontrado en la posición "+pos);   
    }else{
    System.out.println("Número no encontrado");
    }
    if (rep!=0){
    System.out.println("Repeticiones: "+rep);
    } 
}
}