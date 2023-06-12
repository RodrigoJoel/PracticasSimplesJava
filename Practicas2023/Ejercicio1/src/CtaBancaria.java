//Crear una clase "CuentaBancaria" que tenga los atributos titular, número de cuenta y saldo.
// Añade métodos para ingresar dinero, retirar dinero y mostrar el saldo actual. Luego,
// crea un objeto "cuenta1" de la clase "CuentaBancaria" y realiza algunas acciones para probar los métodos

public class CtaBancaria {
    private String titular;
    private double cantidad;

    public CtaBancaria(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public CtaBancaria(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
}