import java.util.Scanner;

//Pedir al usuario que ingrese una frase y luego mostrar cuántas veces aparece una letra específica en ella.
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");//solicitamos una frase por pantalla al usuario
        String frase = scanner.nextLine();//guardamos en la variable frase lo ingresado
        System.out.println("Ingresa la letra que quieres saber cuantas veces aparece:");//solicitamos la letra que desea saber
        char letra =scanner.next().charAt(0);//guardamos en la variable letra el caracter a encontrar

        int cont=0;//inicializamos el contador en cero
        for (int i=0; i<frase.length();i++){//iniciamos la variable en cero, mientras que la variable sea menor a la cantidad de caracteres, sumamos una letras mas
            if (frase.charAt(i)==letra){//si el caracter de la frase es igual a la letra solicitidad
                cont++;//sumamos el contador en uno
            }
        }//mostramos por pantalla laa letra solicitada y la cantidad de veces que se repite en la frase
        System.out.println("La letra: " + letra + " aparece: " + cont + " veces");
    }
}
