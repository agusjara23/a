package cuentabancaria.entidades;

public class entidades {
    //numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual
    private int numCuenta;
    private int DNI;
    private double saldoactual;
    //constructor vacio
    public entidades() {
    }
    //constructor por parámetros
    public entidades(int numCuenta, int DNI, double saldoactual) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoactual = saldoactual;
    }
    //setters & getters

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    @Override
    public String toString() {
        return "entidades{" + "numCuenta=" + numCuenta + ", DNI=" + DNI + ", saldoactual=" + saldoactual + '}';
    }
    
    
    
}
