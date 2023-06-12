
//Crea una clase Círculo que tenga un atributo (radio) y métodos para obtener y establecer el radio. Agrega métodos
//adicionales para calcular el área y la circunferencia del círculo.
public class Circulo {
    private double radio;
    private final double pi = 3.1416;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double area(){
        return pi *Math.pow(radio,2);
    }

    public double Circunferencia(){
        return (2*pi*radio);
    }
}
