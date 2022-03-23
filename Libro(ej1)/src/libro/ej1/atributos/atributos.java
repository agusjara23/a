package libro.ej1.atributos;

public class atributos {
   
    public String ISBN;
    public String título;
    public String autor;
    public int pags;
    //constructor vacio   
    public atributos() {
        
    }
    //constructor con parámetros
    public atributos (String ISBN,String título,String autor,int pags){
        this.ISBN = ISBN;
        this.autor = autor;
        this.pags = pags;
        this.título = título;
    }

    //setters & getters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }


    public String getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getPags() {
        return pags;
    }

    @Override
    public String toString() {
        return "atributos{" + "ISBN=" + ISBN + ", t\u00edtulo=" + título + ", autor=" + autor + ", pags=" + pags + '}';
    }
    

    
    
    
    
    
}   
    

    
