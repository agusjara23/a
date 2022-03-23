
/**
 * Crear una clase llamada Libro que contenga los siguientes atributos:
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
 * atributos pasados por parámetro y un constructor vacío. Crear un método
 * para cargar un libro pidiendo los datos al usuario y luego informar
 * mediante otro método el número de ISBN, el título, el autor del libro y
 * el numero de páginas.
 */
package libro.ej1;

import atributoslibro.Atributoslibro;

import libro.ej1.atributos.atributos;

public class LibroEj1 {
  public static void main(String[] args) {
    Atributoslibro vs = new Atributoslibro();
    atributos l1 = vs.funciones();
    vs.mostrar(l1);

  }
    
  
 

  
}

