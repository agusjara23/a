package Funciones;
import Atributos.Atributos;
import java.util.Scanner;
public class Funciones {

    public Atributos Funciones(){
        //método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
        Atributos r1 = new Atributos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(leer.nextFloat());
        System.out.println("Ingrese la altura del rectángulo");
        r1.setAltura(leer.nextFloat());
        return r1;  
    }
    //método para calcular la superficie del rectángulo y un método para calcular el
    //perímetro del rectángulo.
    //Superficie = base * altura / Perímetro = (base + altura) * 2
    public void CalcurarRec (Atributos r1){
       float superficie;
       superficie = r1.getBase() * r1.getAltura();
       System.out.println("La superfiecie del rectángulo es " + superficie);
       float perímetro;
       perímetro = (r1.getBase() + r1.getAltura()) * 2;
       System.out.println("El perímetro del rectángulo es " + perímetro);
    }
    //método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void Asteriscos (Atributos r1){
        for (int i = 0; i < r1.getBase(); i++){
            System.out.print("* ");
            
        }
        System.out.println();
        
        for (int i = 0; i < r1.getAltura()-2; i++){
            System.out.print("* ");
            for (int j = 0; j < r1.getAltura()-2; j++){
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 0; i < r1.getBase(); i++){
            System.out.print("* ");
        }
         System.out.println();
    }
    
    
    
}
