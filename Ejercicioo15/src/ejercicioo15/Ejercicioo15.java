package ejercicioo15;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
/**
 *
 * @author agust
 */
public class Ejercicioo15 {

    /**
     *  Realizar un programa que pida dos números enteros positivos por teclado y 
    muestre por pantalla el siguiente menú:
   MENU
   1. Sumar
   2. Restar
   3. Multiplicar
   4. Dividir
  5. Salir
  Elija opción:
  
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1,num2,opc;
    String opc1 = null;
    System.out.println("Ingrese dos números");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    do{ 
    System.out.println("Se mostrará un menú de opciones");
    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.Multiplicar");
    System.out.println("4.Dividir");
    System.out.println("5.Salir");
    System.out.println("Ingrese una opción");
    opc = leer.nextInt();
      switch (opc){
    case 1:
       int suma;
       suma = num1 + num2;
       System.out.println("El resultado de la suma de los números es " + suma);
       break;
    case 2:
        int resta;
        resta = num1 - num2;
        System.out.println("El resultado de la resta de los números es " + resta);
        break;
    case 3:
        int multi;
        multi = num1 * num2;
        System.out.println("El resultado de la multiplicación es " + multi);
        break;
    case 4: 
        int div;
        div = num1 / num2;
        System.out.println("El resultado de la división es " + div);
        break;
    case 5:
        System.out.println("¿Está seguro que desea salir del programa? Ingrese 's' si es así");
        opc1 = leer.next();
        opc1 = toUpperCase(opc1);
        break;
  }      
    }while(opc1=="S");  
    }
}

    
    
    
    
        

      
        
        
        
        
        
    
    