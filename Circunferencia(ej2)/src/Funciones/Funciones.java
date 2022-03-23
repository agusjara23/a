package Funciones;
import java.util.Scanner; 
import Circu.Circu;

public class Funciones {
   //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
   public Circu funciones() { 
       Circu c1 = new Circu (); 
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el radio: ");
       c1.setRadio(leer.nextDouble());
       return c1; 
   }
   // Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
   public void Area (Circu c1){
        c1.setArea(Math.PI*c1.getRadio());
   }
   // Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
   public void Perimetro (Circu c1){
       c1.setPerimetro(2*(Math.PI*c1.getRadio()));  
   }
   public void Mostrar (Circu c1,double area,double perimetro){
       System.out.println("Radio: "+ c1.getRadio());
       System.out.println("Área: "+ c1.getArea());
       System.out.println("Perímetro: " + c1.getPerimetro());
   }
}
