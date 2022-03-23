package cafeteraej6.servicios;
import java.util.Scanner;
import cafeteraej6.entidades.entidades;


public class servicios {
    public static Scanner leer = new Scanner(System.in);
  
    entidades c1 = new entidades();
    public void capMax (entidades c1){
        System.out.println("Ingrese la capacidad máxima de la cafetera: ");
        c1.setCapacidadmax(leer.nextInt());
    }
    //• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
  // máxima. 
   public void llenarCafetera (entidades c1){
       c1.setCantidadactual(c1.getCapacidadmax());
   }
   // • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
  // tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
  // cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
  // método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
  // cuanto quedó la taza.
   public int servirTaza (entidades c1){
       System.out.println("Ingrese el tamaño de la taza vacía: ");
       int taza = leer.nextInt();
       c1.setCantidadactual(- taza);
       if (c1.getCantidadactual()<0){
           System.out.println("Llenando taza: ");
         for (int i = 0; i < taza; i++){
             System.out.print(i + "..");
         }  
           System.out.println("Taza llena");
       } else {
           System.out.println("No hay suficiente café para llenar la taza");
       }
       return taza; 
   }
   // • Método vaciarCafetera(): pone la cantidad de café actual en cero. 
   public void vaciarCafetera (entidades c1){
       c1.setCantidadactual(0);
   }
    // • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
  // recibe y se añade a la cafetera la cantidad de café indicada. 
   public int agregarCafe (entidades c1){
       System.out.println("Ingrese una cantidad de café: ");
       int café = leer.nextInt();
       c1.setCantidadactual(+ café);
       return c1.getCantidadactual();
   }
   
}
