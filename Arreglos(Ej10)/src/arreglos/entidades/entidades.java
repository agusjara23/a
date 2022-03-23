package arreglos.entidades;

public class entidades {
     private double arregloA;
     private double arregloB;

    public entidades() {
    }

    public entidades(double arregloA, double arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double getArregloA() {
        return arregloA;
    }

    public void setArregloA(double arregloA) {
        this.arregloA = arregloA;
    }

    public double getArregloB() {
        return arregloB;
    }

    public void setArregloB(double arregloB) {
        this.arregloB = arregloB;
    }

    @Override
    public String toString() {
        return "entidades{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }
     
     
     
    
}
