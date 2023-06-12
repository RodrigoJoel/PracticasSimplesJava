import java.util.Scanner;

//Pedir al usuario que ingrese una cadena de texto y luego mostrar su longitud (cantidad de caracteres).
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto: (el que mas le guste)");
        String texto = scanner.nextLine();
        System.out.println(texto.length());//length muestra la cantidad de caracteres
    }
}
