package cadena.ej8;
import java.util.Scanner;
import cadena.entidades.entidades;
import cadena.servicios.servicios;

public class CadenaEj8 {
    public static Scanner leer = new Scanner(System.in);
    /**
     * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
     * String) y su longitud. En el main se creará el objeto y se le
     * pedirá al usuario que ingrese una frase que puede ser una palabra o
     * varias palabras separadas por un espacio en blanco y a través de los
     * métodos set, se guardará la frase y la longitud de manera automática
     * según la longitud de la frase ingresada. Deberá además implementar los
     * siguientes métodos: 
     * • Método mostrarVocales(), deberá contabilizar la
     * cantidad de vocales que tiene la frase ingresada. 
     * • Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
     * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". 
     * • Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se
     * repite 4 veces. 
     * • Método compararLongitud(String frase), deberá comparar
     * la longitud de la frase que compone la clase con otra nueva frase
     * ingresada por el usuario. 
     * • Método unirFrases(String frase), deberá unir
     * la frase contenida en la clase Cadena con una nueva frase ingresada por
     * el usuario y mostrar la frase resultante. 
     * • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la
     * frase, por algún otro carácter seleccionado por el usuario y mostrar la
     * frase resultante. 
     * • Método contiene(String letra), deberá comprobar si la
     * frase contiene una letra que ingresa el usuario y devuelve verdadero si
     * la contiene y falso si no.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entidades ent = new entidades();
        System.out.println("Ingrese una frase (palabra o varias palabras)");
        String frase = leer.nextLine();
        ent.setFrase(frase);
        ent.setLongitud(ent.getFrase().length());
        servicios frase1 = new servicios();
        System.out.println("Ingrese lo que desea realizar con la frase: ");
        System.out.println("1. Mostrar la cantidad de vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Veces repetido");
        System.out.println("4. Comparar longitud con una nueva frase");
        System.out.println("5. Unir frases con una nueva frase");
        System.out.println("6. Reemplazar la letra 'a' con un cáracter ingresado ");
        System.out.println("7. Contiene letra ");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Vocales encontradas: " + frase1.mostrarVocales(ent));
                break;
            case 2:
                System.out.println("Frase invertida: " + frase1.invertirFrase(ent));
                break;
            case 3:
                System.out.println("Veces repetidas: " + frase1.vecesRepetido(ent));
                break;
            case 4:
                System.out.println("Comparación: " + frase1.compararLongitud(ent));
                break;
            case 5:
                System.out.println("Nueva frase:" + frase1.unirFrases(ent));
                break;
            case 6:
                String nuevaFrase = frase1.reemplazar(ent);
                System.out.println(nuevaFrase);
                break;
            case 7:
                System.out.println("Contiene letra: " + frase1.contiene(ent));
                break;
        }
        
        
        
        
       
       
        
    }
    
}
