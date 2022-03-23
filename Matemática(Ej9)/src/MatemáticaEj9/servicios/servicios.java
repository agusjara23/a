package MatemáticaEj9.servicios;

import MatemáticaEj9.entidades.entidades;
import static java.lang.Math.round;


public class servicios {
    // • Método devolverMayor() para retornar cuál de los dos atributos tiene el
    //mayor valor 
    public double devolverMayor (entidades ent){
        double numMayor = 0;
        double numMenor = 0;
        if (ent.getNum1()<=ent.getNum2()){
            numMayor = ent.getNum2();
            numMenor = ent.getNum1();
        } else if (ent.getNum2()<=ent.getNum1()){
            numMayor = ent.getNum1();
            numMenor = ent.getNum2();
        } 
        return numMayor;
    } 
   //• Método calcularPotencia() para calcular la potencia del mayor
   // valor de la clase elevado al menor número. Previamente se deben redondear
   // ambos valores.
    public double calcularPotencia (entidades ent){
        ent.setNum1(Math.round(ent.getNum1()));
        ent.setNum2(Math.round(ent.getNum2()));
        double numMayor = 0;
        double numMenor = 0;
        if (ent.getNum1()<ent.getNum2()){
            numMayor = ent.getNum2();
            numMenor = ent.getNum1();
        } else if (ent.getNum2()<ent.getNum1()){
            numMayor = ent.getNum1();
            numMenor = ent.getNum2();
        } 
        double resultadoPotencia = Math.pow(numMayor, numMenor);
        Math.round(resultadoPotencia);
        return resultadoPotencia;
    }
   //• Método calculaRaiz(), para calcular la raíz cuadrada del
   //menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener
   //el valor absoluto del número
    public double calcularRaiz (entidades ent){
        ent.setNum1(Math.abs(ent.getNum1()));
        ent.setNum2(Math.abs(ent.getNum2()));
        double numMayor = 0;
        double numMenor = 0;
        if (ent.getNum1()<ent.getNum2()){
            numMayor = ent.getNum2();
            numMenor = ent.getNum1();
        } else if (ent.getNum2()<ent.getNum1()){
            numMayor = ent.getNum1();
            numMenor = ent.getNum2();
        } 
        double resultadoRaiz = Math.sqrt(numMenor);
        Math.round(resultadoRaiz);
        return resultadoRaiz;
    }
    
    
}
