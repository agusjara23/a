package ejercicioo22;

/**
 *
 * @author agust
 */
public class Ejercicioo22 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
     cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int [] vector = new int [20];
    int cant1=0,cant2=0,cant3=0,cant4=0,cant5=0;
    for (int i = 0; i < 20; i++) {
        vector[i] = (int) (Math.random()*10000);
        String largo = String.valueOf(vector[i]);
        System.out.println(largo.length());
         if (largo.length()==1){
          cant1 = cant1+1;
      }
         if (largo.length()==2){
          cant2 = cant2+1;
      }
          if (largo.length()==3){
          cant3 = cant3+1;
      }
         if (largo.length()==4){
          cant4 = cant4+1;
      }
         if (largo.length()==5){
          cant5 = cant5+1;
      }
    } 
    System.out.println("Números con 1 dígito: " + cant1);
      System.out.println("Números con 2 dígitos: " + cant2);
      System.out.println("Números con 3 dígitos: " + cant3);
      System.out.println("Números con 4 dígitos: " + cant4);
      System.out.println("Números con 5 dígito: " + cant5);
    }
    
      
    
}
