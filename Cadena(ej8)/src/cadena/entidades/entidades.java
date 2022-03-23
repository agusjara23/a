package cadena.entidades;
//atributos una frase (de tipo de String) y su longitud.
public class entidades {
    private String frase;
    private int longitud;
    
    public entidades() {
    
    }

    public entidades(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "entidades{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    

    }

   
    
    

