import java.util.Scanner;

//Crear un programa que calcule la suma de los números pares en un rango de números ingresado por el usuario
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número final del rango :");
        int rango = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= rango; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares del rango es: " + suma);
    }
}


