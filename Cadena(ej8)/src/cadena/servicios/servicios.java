package cadena.servicios;
import cadena.entidades.entidades;
import java.util.Scanner;

//     * • Método contiene(String letra), deberá comprobar si la
//     * frase contiene una letra que ingresa el usuario y devuelve verdadero si
//     * la contiene y falso si no.
public class servicios {
    public static Scanner leer = new Scanner(System.in);
//* • Método mostrarVocales(), deberá contabilizar la
//* cantidad de vocales que tiene la frase ingresada. 
    public int mostrarVocales (entidades ent){
        int vocales = 0;
        ent.setFrase(ent.getFrase().toUpperCase());
        for (int i = 0; i < ent.getLongitud(); i++){
          if (ent.getFrase().charAt(i) == 'A'||ent.getFrase().charAt(i) == 'E' ||ent.getFrase().charAt(i) == 'I'|| ent.getFrase().charAt(i) == 'O'||ent.getFrase().charAt(i) == 'U') {
                vocales++;
            }   
        }
      return vocales;
    }
//     * • Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
//     * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
    public String invertirFrase(entidades ent){
        String fraseInvertida = "";
        for (int i = ent.getLongitud()-1; i > -1 ; i--) {
            fraseInvertida = fraseInvertida + ent.getFrase().charAt(i);
        }
        System.out.println(fraseInvertida);
        return fraseInvertida;
    }
//     * • Método vecesRepetido(String letra), recibirá un carácter ingresado por el
//     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
//     * por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se
//     * repite 4 veces. 
    public int vecesRepetido (entidades ent){
        int contador = 0;
        System.out.println("Ingrese la letra que desea buscar: ");
        String letra = leer.next();
        char [] array = ent.getFrase().toCharArray();
        for (int i = 0; i < ent.getLongitud(); i++){
            if (ent.getFrase().contains (letra) ){
                contador++;
            } 
        }
        return contador;
    }
//     * • Método compararLongitud(String frase), deberá comparar
//     * la longitud de la frase que compone la clase con otra nueva frase
//     * ingresada por el usuario. 
     public int compararLongitud (entidades ent) { 
         String fraseIngresada;
         System.out.println("Ingrese una frase para comparar la longitud con la frase anteriormente ingresada: ");
         fraseIngresada = leer.next();
         int Comparación;
         Comparación = (fraseIngresada.length()-ent.getLongitud());
         return Comparación;
     }
//     * • Método unirFrases(String frase), deberá unir
//     * la frase contenida en la clase Cadena con una nueva frase ingresada por
//     * el usuario y mostrar la frase resultante. 
     public String unirFrases (entidades ent){
         System.out.println("Ingrese una frase/palabra para unirla a la frase anteriormente ingresada: ");
         String fraseIngresada = leer.next();
         String fraseUnida = ent.getFrase().concat(" " + fraseIngresada);
         return fraseUnida;
     }   
//     * • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la
//     * frase, por algún otro carácter seleccionado por el usuario y mostrar la
//     * frase resultante. 
     public String reemplazar (entidades ent){
         System.out.println("Ingrese un carácter: ");
         String caracter = leer.next();
         for (int i = 0; i < ent.getLongitud(); i++){
             if (ent.getFrase().charAt(i) == 'a'){
                 ent.setFrase(ent.getFrase().replace("a", caracter));
             }
         }   
         String nuevaFrase = ent.getFrase();
         return nuevaFrase;
     }
//     * • Método contiene(String letra), deberá comprobar si la
//    * frase contiene una letra que ingresa el usuario y devuelve verdadero si
//    * la contiene y falso si no.
     public boolean contiene (entidades ent){
         System.out.println("Ingrese la letra que desea buscar: ");
         String letra = leer.next();
         boolean comprobar = false;
         for (int i = 0; i < ent.getLongitud(); i++){
             if (ent.getFrase().contains(letra)){
                 comprobar = true;
             } else {
                 comprobar = false;
             }
         }
          return comprobar; 
     }
}
