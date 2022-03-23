package Atributos;

public class Atributos {
    //atributo privado base y un atributo privado altura
    private float base;
    private float altura;
    //constructor vacio
    public Atributos (){
        
    }
     //constructor por parámetros
    public Atributos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    //setters & getters

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Atributos{" + "base=" + base + ", altura=" + altura + '}';
    } 

  
    }

