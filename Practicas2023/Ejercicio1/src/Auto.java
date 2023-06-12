public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private int velocidadMaxima;
    private int velocidadActual;

    public Auto(String marca, String modelo, int año, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void acelerar(int incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
        } else {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
        } else {
            velocidadActual = 0;
        }
    }
}
