import java.util.Scanner;

//Pedir al usuario que ingrese su edad y luego mostrar si es mayor o menor de edad (18 años)
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad :");
        int edad = scanner.nextInt();

        if (edad <=17){
            System.out.println("La persona es menor de edad");
        }else{
            System.out.println("La persona es mayor de edad");
        }
    }
}
