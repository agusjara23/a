package date.entidades;

import java.util.Date;

public class entidades {
    private Date fechaFinal;
    private int dia;
    private int mes;
    private int anio;

    public entidades(Date fechaFinal, int dia, int mes, int anio) {
        this.fechaFinal = fechaFinal;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    public entidades() {
        fechaFinal = new Date();
    }

    public entidades(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
    public void mostrarFecha(){
        System.out.println("Día: " + fechaFinal.getDate()
        + " Mes: " + fechaFinal.getMonth()
        + " Año: " + fechaFinal.getYear());
     
    }
  
}
