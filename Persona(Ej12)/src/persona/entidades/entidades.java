package persona.entidades;

import java.util.Date;

public class entidades {
    private String nombre; 
    private Date fechaDeNacimiento;

    public entidades() {
        fechaDeNacimiento = new Date();
    }

    public entidades(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void llenarFecha(Date fechaNacimiento) {

        this.fechaDeNacimiento = fechaNacimiento; // Lo guardamos en el atributo

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
     
     //• Metodo mostrarPersona(): este método muestra 
    //la persona creada en el método anterior.

    @Override
    public String toString() {
        return "entidades{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
}
