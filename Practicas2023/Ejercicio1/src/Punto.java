//Crea una clase Punto que tenga dos atributos (x e y) y métodos para obtener y establecer cada uno de ellos.
// Agrega un método adicional para calcular la distancia entre dos puntos.
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        double distanciaX = otroPunto.getX() - x;
        double distanciaY = otroPunto.getY() - y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
}
