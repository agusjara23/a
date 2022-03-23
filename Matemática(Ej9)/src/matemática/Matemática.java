package matemática;

import MatemáticaEj9.entidades.entidades;
import MatemáticaEj9.servicios.servicios;

public class Matemática {

    /**
     * Realizar una clase llamada Matemática que tenga como atributos dos
     * números reales con los cuales se realizarán diferentes operaciones
     * matemáticas. La clase deber tener un constructor vacío, parametrizado y
     * get y set. En el main se creará el objeto y se usará el Math.random para
     * generar los dos números y se guardaran en el objeto con su respectivos
     * set. Deberá además implementar los siguientes métodos: • Método
     * devolverMayor() para retornar cuál de los dos atributos tiene el mayor
     * valor • Método calcularPotencia() para calcular la potencia del mayor
     * valor de la clase elevado al menor número. Previamente se deben redondear
     * ambos valores. • Método calculaRaiz(), para calcular la raíz cuadrada del
     * menor de los dos valores. Antes de calcular la raíz cuadrada se debe
     * obtener el valor absoluto del número
     *
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entidades ent = new entidades ();
        int num1 = (int) (Math.random()*50);
        ent.setNum1(num1);
        int num2 = (int) (Math.random()*50);
        ent.setNum2(num2);
        servicios Mat = new servicios ();
        double numMayor = Mat.devolverMayor(ent);
        System.out.println("Número mayor: " + numMayor);
        double resultadoPotencia = Mat.calcularPotencia(ent);
        System.out.println("Resultado potencia: " + resultadoPotencia);
        double resultadoRaiz = Mat.calcularRaiz(ent);
        System.out.println("Resultado raíz: " + resultadoRaiz);
    }
    
}
