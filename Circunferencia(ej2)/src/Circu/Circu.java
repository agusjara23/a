package Circu;


public class Circu {
    private double radio;
    private double area;
    private double perimetro;
    
    public Circu(){
        
    }
    // Método constructor que inicialice el radio pasado como parámetro.
    public Circu(double radio) {
        this.radio = radio;
    }

    public Circu(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }
    
    //Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circu{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

   
    
    
    
    
}

