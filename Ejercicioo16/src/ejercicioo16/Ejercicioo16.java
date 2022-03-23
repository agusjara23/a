package ejercicioo16;
import java.util.Scanner;
/**
 *
 * @author agust
 */
public class Ejercicioo16 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
    tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
    con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
    carácter tiene que ser X y el último tiene que ser una O. 
    Las secuencias leídas que respeten el formato se consideran correctas, la 
    secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
    secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
    correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
    se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena,pc="X",uc="O",sub1,sub2,FDE="&&&&&";
    int lon,c1=0,c2=0;
    do {
    System.out.println("Ingrese una cadena"); 
    cadena = leer.next();
    if (cadena.length()==5){
         sub1 = cadena.substring(0,1);
         sub2 = cadena.substring(4,5);
    }else{
     c2 = c2 + 1;
    continue;
    }
        if (sub1.equalsIgnoreCase(pc) && sub2.equalsIgnoreCase(uc)){
        c1 = c1 + 1;
        }else if(cadena.equals(FDE)){
          System.out.println("Lecturas correctas "+c1);
          System.out.println("Lecturas incorrectas "+c2);
          break;
        }else{  
        c2 = c2 + 1;          
        }
    }
    while (cadena!=FDE);
}
}