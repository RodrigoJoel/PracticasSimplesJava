//Crea una clase Rectángulo que tenga dos atributos (base y altura) y métodos para obtener y establecer cada uno de ellos.
// Agrega un método adicional para calcular el área del rectángulo.
public class Rectangulo {

    private int base;
    private int altura;
    public int area;

    public Rectangulo(int base, int altura, int area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int area() {
        area = base * altura;
        System.out.println("el area es: " + area);
        return area;
    }
}

