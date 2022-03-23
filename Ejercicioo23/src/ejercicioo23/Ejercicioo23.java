package ejercicioo23;

/**
 *
 * @author agust
 */
public class Ejercicioo23 {

    /**
     *  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
    la traspuesta de la matriz.
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [][] matriz = new int [4][4];
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
    matriz[i][j] = (int) (Math.random()*30);
    }
    }
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    System.out.println();
    int aux;
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < i; j++) {
    aux =  matriz[i][j];
    matriz[i][j] = matriz [j][i];
    matriz [j][i] = aux;
    }
    }
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
    
}
