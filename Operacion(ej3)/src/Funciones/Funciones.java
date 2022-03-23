package Funciones;
import java.util.Scanner;
import atributos.Atributos;

public class Funciones {
   //d) Método para crearOperacion(): que le pide al usuario los dos números y los
   //guarda en los atributos del objeto.
    public Atributos Funciones(){
        Atributos o1 = new Atributos ();
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos números enteros: ");
        o1.setNum1(leer.nextInt());
        o1.setNum2(leer.nextInt());
        return o1;
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int Sumar (Atributos o1){
       int suma;
        suma = (o1.getNum1() + o1.getNum2());
        return suma;
    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int Restar (Atributos o1){
        int resta;
        resta = (o1.getNum1() - o1.getNum2());
        return (o1.getNum1() - o1.getNum2());
    }
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero
    public int Multiplicar(Atributos o1){
        if (o1.getNum1()>=0||o1.getNum2()>=0){
        int multi;
        multi = (o1.getNum1() * o1.getNum2());
            return multi;
        }else{
            System.out.println("Error");  
            return 0;
        }
    }
    //h) Método dividir(): primero valida que no se haga una división por cero
    public int Dividir (Atributos o1){
        if (o1.getNum1()>=0||o1.getNum2()>=0){
        int divi;
        divi = (o1.getNum1() / o1.getNum2());
            return divi;
        }else{
            System.out.println("Error");  
            return 0;
        }
    }
    public void Mostrar (Atributos o1,int suma, int resta,int multi,int divi){
        System.out.println("Suma de los números ingresados: " + suma );
        System.out.println("Resta de los números ingresados: " + resta);
        System.out.println("Multilicación de los números ingresados: "+ multi);
        System.out.println("División de los números ingresados: " + divi);
    }
}
