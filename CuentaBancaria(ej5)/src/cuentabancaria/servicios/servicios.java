package cuentabancaria.servicios;
import cuentabancaria.entidades.entidades;
import java.util.Scanner;
public class servicios {
    public static Scanner leer = new Scanner (System.in);
   
    //  • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public entidades Cuenta (){
        
        entidades PrimeraCuenta = new entidades ();
        System.out.println("Ingrese el número de su cuenta");
        PrimeraCuenta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        PrimeraCuenta.setDNI(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        PrimeraCuenta.setSaldoactual(leer.nextDouble());
        return PrimeraCuenta;
    }
  //  • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
  //  ingresar y se la sumara a saldo actual.
  //  • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
  //  se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
  //  pondrá el saldo actual en 0.
  //  • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
  //  que el usuario no saque más del 20%.
  //  • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
  //  • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta  
    public void Opciones (entidades PrimeraCuenta){
        
        
        System.out.println("Ingrese la acción que desea realizar: ");
        System.out.println("1. Ingresar dinero");    
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extracción rápida");        
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos");       
        System.out.println("6. Salir");
        int opc = leer.nextInt();
        
        switch (opc){
              case 1:
                  System.out.println("Ingrese el monto: ");
               int ingreso = leer.nextInt();
              PrimeraCuenta.setSaldoactual(PrimeraCuenta.getSaldoactual() + ingreso);
              break;
              case 2:
                  System.out.println("Ingrese el monto a retirar");
               int retiro = leer.nextInt();
               PrimeraCuenta.setSaldoactual(PrimeraCuenta.getSaldoactual() - retiro);
               if (PrimeraCuenta.getSaldoactual()<0){
                   PrimeraCuenta.setSaldoactual(0);
               }else{
                   PrimeraCuenta.setSaldoactual(PrimeraCuenta.getSaldoactual());
               }
               break;
              case 3:
                  System.out.println("Con el método de extracción rápida, solo se podrá retirar un 20% de su sueldo actual");
                  PrimeraCuenta.setSaldoactual(PrimeraCuenta.getSaldoactual() % 20);
               break;
              case 4:
                  System.out.println("Saldo actual: " + PrimeraCuenta.getSaldoactual());
               break;
              case 5:
                  System.out.println("Número de cuenta: " + PrimeraCuenta.getNumCuenta());
                  System.out.println("DNI: " + PrimeraCuenta.getDNI());       
               break;
          }
            
        
        
    }
  
}
