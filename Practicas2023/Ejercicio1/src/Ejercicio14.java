import java.util.Scanner;

//Crear un programa que calcule el factorial de un número ingresado por el usuario
public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero del que desea ver el factorial: ");
        int num = teclado.nextInt();
        if (num < 0) {
            System.out.println("No se puede calcular factorial de un valor negativo.");
        } else {
            int resultado = Factorial(num);
            System.out.printf("El resultado es: %d\n", resultado);
        }
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}


