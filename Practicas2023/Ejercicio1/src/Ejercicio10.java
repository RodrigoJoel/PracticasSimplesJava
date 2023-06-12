import java.util.Scanner;

//Pedir al usuario que ingrese dos números y luego mostrar cuál es el mayor y cuál es el menor.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num1= scanner.nextInt();
        System.out.println("Ingresa otro numero:");
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println("El primer numero ingresado es mayor al segundo");
        }else {
            System.out.println("El segundo numero ingresado es mayor al primero ");
        }
    }
}
