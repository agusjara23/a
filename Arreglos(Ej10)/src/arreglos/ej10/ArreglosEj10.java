package arreglos.ej10;

import arreglos.entidades.entidades;
import java.util.Arrays;

public class ArreglosEj10 {

    /**
     * Realizar un programa en Java donde se creen dos arreglos: el primero será
     * un arreglo A de 50 números reales, y el segundo B, un arreglo de 20
     * números, también reales. 
     * El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
     * Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al
     * arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el
     * valor 0.5. 
     * Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entidades ent = new entidades ();
        double [] arreglo10 = new double [10];
        double [] arregloA = new double [50];
        double[] arregloB = new double[20];
        for (int i = 0; i < 50 ; i++) {
            ent.setArregloA(i);arregloA[i] = (double) (Math.random()*51);
        }
        for (int i = 0; i < 50 ; i ++){
            System.out.print(i);
            System.out.println( "[" + arregloA[i] + "]" );
        }
        
        System.out.println("");
          
        for (int i = 0; i < 50 ; i++){
            Arrays.sort(arregloA, 0, 49);
            Arrays.fill(arregloB, i);
        }
        
        for(int i = 0 ; i < 10; i++){
            Arrays.fill(arreglo10, 0, 10, arregloA[i]);
        }
    
        
        for (int i = 0; i < 20; i++) {
            Arrays.fill(arregloB, 10, 20 , 0.5);
            
        }
        for (int i = 0; i < 50 ; i++){ 
            System.out.print(i);
            System.out.println("[" + arregloA[i] + "]" );
        }
        
        for (int i = 0; i < 20 ; i++){
            System.out.print(i);
           System.out.println( "[" + arregloB[i] + "]" );
        }
    }

}
