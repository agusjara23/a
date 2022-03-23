package atributoslibro;
import java.util.Scanner;
import libro.ej1.atributos.atributos;


public class Atributoslibro {
    public atributos funciones(){
    //objeto --> libro
    atributos l1 = new atributos();
    
    Scanner leer = new Scanner(System.in);
    //ISBN,título,autor,pags.
    //lleno atributos
    
    System.out.println("Ingrese el título del libro");
    l1.setTítulo(leer.next());
    System.out.println("Ingrese el autor de libro");
    l1.setAutor(leer.next());
    System.out.println("Ingrese el ISBN del libro");
    l1.setISBN(leer.next());
    System.out.println("Ingrese la cantidad de páginas del libro");
    l1.setPags(leer.nextInt());
    
        return l1;
        
}
 public void mostrar (atributos l1){
     System.out.println("El título del libro es " + l1.getTítulo());
     System.out.println("El autor del libro es "+l1.getAutor());
     System.out.println("El ISBN del libro es "+l1.getISBN());
     System.out.println("Cantidad de páginas del libro: "+l1.getPags());
    }
     
 }

