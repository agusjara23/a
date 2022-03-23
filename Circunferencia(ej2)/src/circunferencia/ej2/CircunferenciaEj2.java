package circunferencia.ej2;

import Circu.Circu;
import Funciones.Funciones;
public class CircunferenciaEj2 {

    /** Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
    de tipo real. A continuación, se deben crear los siguientes métodos:
    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
    del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funciones vs = new Funciones();
       Circu c1 = vs.funciones();
       vs.Area(c1);
       vs.Perimetro(c1);
       vs.Mostrar(c1, 0, 0);
    }
    
}
