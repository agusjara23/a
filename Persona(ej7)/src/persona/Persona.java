package persona;

import Personaej7.entidades.entidades;
import Personaej7.servicios.servicios;
import static javafx.scene.input.KeyCode.X;

public class Persona {

    /**
     * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
    sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
    otro atributo, puede hacerlo. Los métodos que se implementarán son:
    • Un constructor por defecto.
    • Un constructor con todos los atributos como parámetro.
    • Métodos getters y setters de cada atributo.
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    O. Si no es correcto se deberá mostrar un mensaje
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
    tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
    persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
    en distintas variables, para después en el main, calcular un porcentaje de esas 4
    personas cuantas están por debajo de su peso, cuantas en su |peso ideal| y cuantos, |por
    encima|, y también calcularemos un porcentaje de cuantos |son mayores de edad| y
    cuantos| menores|.
     * 
     * 
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicios PersonaServicios = new servicios();
        int debajoDelPeso = 0;
        int pesoIdeal = 0;
        int encimaDelPeso = 0;
        int mayores = 0;
        int menores = 0;
        entidades Persona[] = new entidades [4];
        Persona [0] = PersonaServicios.crearPersona();
        switch (PersonaServicios.calcularIMC(Persona[0])) {
                case -1:
                    System.out.println("Por debajo de su peso ideal");
                    debajoDelPeso = debajoDelPeso + 1;
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    pesoIdeal = pesoIdeal + 1;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    encimaDelPeso = encimaDelPeso + 1;
                    break;
            }
             if (PersonaServicios.esMayordeEdad(Persona[0]) == true) {
                        System.out.println("Es mayor de edad");
                        mayores = mayores + 1;
                    } else {
                        System.out.println("Es menor de edad");
                        menores= menores + 1;
                    }
        Persona [1] = PersonaServicios.crearPersona();
        switch (PersonaServicios.calcularIMC(Persona[1])) {
                case -1:
                    System.out.println("Por debajo de su peso ideal");
                    debajoDelPeso = debajoDelPeso + 1;
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    pesoIdeal = pesoIdeal + 1;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    encimaDelPeso = encimaDelPeso + 1;
                    break;
            }
             if (PersonaServicios.esMayordeEdad(Persona[1]) == true) {
                        System.out.println("Es mayor de edad");
                        mayores = mayores + 1;
                    } else {
                        System.out.println("Es menor de edad");
                        menores= menores + 1;
                    }
        Persona [2] = PersonaServicios.crearPersona();
        switch (PersonaServicios.calcularIMC(Persona[2])) {
                case -1:
                    System.out.println("Por debajo de su peso ideal");
                    debajoDelPeso = debajoDelPeso + 1;
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    pesoIdeal = pesoIdeal + 1;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    encimaDelPeso = encimaDelPeso + 1;
                    break;
            }
             if (PersonaServicios.esMayordeEdad(Persona[2]) == true) {
                        System.out.println("Es mayor de edad");
                        mayores = mayores + 1;
                    } else {
                        System.out.println("Es menor de edad");
                        menores= menores + 1;
                    }
        Persona [3] = PersonaServicios.crearPersona();
        switch (PersonaServicios.calcularIMC(Persona[3])) {
                case -1:
                    System.out.println("Por debajo de su peso ideal");
                    debajoDelPeso = debajoDelPeso + 1;
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    pesoIdeal = pesoIdeal + 1;
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    encimaDelPeso = encimaDelPeso + 1;
                    break;
            }
             if (PersonaServicios.esMayordeEdad(Persona[3]) == true) {
                        System.out.println("Es mayor de edad");
                        mayores = mayores + 1;
                    } else {
                        System.out.println("Es menor de edad");
                        menores= menores + 1;
                    }
        

        int resultadoDebajoDelPeso = (debajoDelPeso*100)/4;
        System.out.println("El porcentaje de personas que se encuentran por debajo de su peso ideal es de: " + resultadoDebajoDelPeso + "%");
        int resultadoPesoIdeal = (pesoIdeal*100)/4;
        System.out.println("El porcentaje de personas que se encuentran en su peso ideal es de: " + resultadoPesoIdeal + "%");
        int resultadoEncimaDelPeso = (encimaDelPeso*100)/4;
        System.out.println("El porcentaje de personas que se encuentran por encima de peso ideal es de: " + resultadoEncimaDelPeso + "%");
        int resultadoMayores = (mayores*100)/4;
        System.out.println("El porcentaje de personas mayores de edad es de: " + resultadoMayores + "%");
        int resultadoMenores = (menores*100)/4;
        System.out.println("El porcentaje de personas menores de edad es de: " + resultadoMenores + "%");
    }
    
}
