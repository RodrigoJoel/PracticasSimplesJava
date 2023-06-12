import java.util.Scanner;

//Crear un programa que solicite al usuario una cadena de texto y luego genere una nueva cadena
// en la que las letras estén invertidas (por ejemplo, "hola" se convertiría en "aloh").
public class Ejercicio13 {

    public static void main(String[] args) {
        String cadena;
        StringBuilder invertida = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        cadena = scanner.nextLine();
        for (int i = cadena.length() - 1; i >= 0; i--)
            invertida.append(cadena.charAt(i));
        System.out.println(invertida);
    }
}
