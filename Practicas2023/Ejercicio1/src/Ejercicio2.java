import java.util.Scanner;

//Pedir al usuario que ingrese su nombre y luego imprimir un saludo personalizado.
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre =scanner.nextLine();
        System.out.println("Ingresa tu apellido");
        String apellido =scanner.nextLine();
        System.out.println("Hola "+nombre + apellido +" todo bien?. Que tengas un excelente dia... :)");
    }
}
