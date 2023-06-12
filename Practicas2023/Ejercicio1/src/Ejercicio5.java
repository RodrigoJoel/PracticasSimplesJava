import java.util.Scanner;

//Pedir al usuario que ingrese un número y luego mostrar si es par o impar.
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();

        if (numero%2==0){
            System.out.println("El numero ingresado es par ");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
