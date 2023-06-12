import java.util.Scanner;

//Calcular y mostrar el área de un triángulo con base y altura ingresadas por el usuario.
public class Ejercicio4 {

    int area;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la base:");
        int base = scanner.nextInt();
        System.out.println("Ingresa la altura:");
        int altura = scanner.nextInt();

        int area = (base*altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
