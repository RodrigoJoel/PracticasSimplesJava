public class PuntoMain {
    public static void main(String[] args) {
        // Crear dos puntos
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(3, 4);

        // Mostrar las coordenadas de los puntos
        System.out.println("Coordenadas del punto 1: (" + punto1.getX() + ", " + punto1.getY() + ")");
        System.out.println("Coordenadas del punto 2: (" + punto2.getX() + ", " + punto2.getY() + ")");

        // Cambiar la coordenada x del punto 1
        punto1.setX(2);

        // Calcular la distancia entre los puntos
        double distancia = punto1.distancia(punto2);
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
