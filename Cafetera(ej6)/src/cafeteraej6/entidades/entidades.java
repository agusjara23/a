package cafeteraej6.entidades;

public class entidades {
  //capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
  //cantidadActual (la cantidad actual de café que hay en la cafetera)  
    private int Capacidadmax;
    private int Cantidadactual;
    // constructor vacio
    public entidades() {
        
    }
    // constructor por parámetros
    public entidades(int Capacidadmax, int Cantidadactual) {
        this.Capacidadmax = Capacidadmax;
        this.Cantidadactual = Cantidadactual;
    }
    //setters & getters

    public void setCapacidadmax(int Capacidadmax) {
        this.Capacidadmax = Capacidadmax;
    }

    public void setCantidadactual(int Cantidadactual) {
        this.Cantidadactual = Cantidadactual;
    }

    public int getCapacidadmax() {
        return Capacidadmax;
    }

    public int getCantidadactual() {
        return Cantidadactual;
    }

    @Override
    public String toString() {
        return "entidades{" + "Capacidadmax=" + Capacidadmax + ", Catidadactual=" + Cantidadactual + '}';
    }
    
}

