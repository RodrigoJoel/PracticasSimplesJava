import java.util.Scanner;

//Calcular y mostrar la suma de dos números ingresados por el usuario.
public class Ejercicio3 {

     static int c=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa un numero:");
        int num2 = scanner.nextInt();

        c = num1+num2;

        System.out.println("La suma de ambos numeros es: "+c);

    }
}
