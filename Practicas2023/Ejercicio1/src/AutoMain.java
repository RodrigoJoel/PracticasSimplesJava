import java.util.Scanner;

public class AutoMain {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese marca:");
        String marca = sc.nextLine();
        System.out.println("Ingrese modelo:");
        String modelo = sc.nextLine();
        System.out.println("Ingrese año:");
        int año = sc.nextInt();
        System.out.println("Ingrese velocidad máxima:");
        int velocidadMaxima = sc.nextInt();

        Auto auto1 = new Auto(marca, modelo, año, velocidadMaxima);
        System.out.println("Marca: " + auto1 + "Modelo: " + modelo + "Año: " + año + "VelocidadMaxima: " + velocidadMaxima);

    }
}