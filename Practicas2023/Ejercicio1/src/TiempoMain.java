public class TiempoMain {
    public static void main(String[] args) {
        // Crear dos objetos Tiempo
        Tiempo tiempo1 = new Tiempo(1, 30, 0);
        Tiempo tiempo2 = new Tiempo(0, 45, 30);

        // Mostrar los tiempos
        System.out.println("Tiempo 1: " + tiempo1.getHoras() + ":" + tiempo1.getMinutos() + ":" + tiempo1.getSegundos());
        System.out.println("Tiempo 2: " + tiempo2.getHoras() + ":" + tiempo2.getMinutos() + ":" + tiempo2.getSegundos());

        // Sumar los tiempos
        tiempo1.sumar(tiempo2);
        System.out.println("Tiempo 1 + Tiempo 2: " + tiempo1.getHoras() + ":" + tiempo1.getMinutos() + ":" + tiempo1.getSegundos());

        // Restar los tiempos
        tiempo1.restar(tiempo2);
        System.out.println("Tiempo 1 - Tiempo 2: " + tiempo1.getHoras() + ":" + tiempo1.getMinutos() + ":" + tiempo1.getSegundos());
    }
}
