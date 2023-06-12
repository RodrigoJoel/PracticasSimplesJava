import java.util.Scanner;

//Crear un programa que genere un número aleatorio entre 1 y 100, y luego permita al usuario adivinarlo. El programa deberá
// indicar si el número ingresado por el usuario es mayor o menor al número generado, y continuar permitiendo adivinanzas
// hasta que el usuario acierte.
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int numero;
        int intentos = 0;

        int random = (int) (Math.random()*100 + 1);/*genera un numero aleatorio desde el 0 al 1
                                                    pero al multiplicar por 100 y sumado 1
                                                    queda desde el 1 al 100 inclusive*/

        do {
            System.out.println("Ingrese un numero del 1 al 100: ");
            numero = entrada.nextInt();

            if (random > numero) {
                System.out.println("Ingrese un numero mayor ");
            } if (random < numero) {
                System.out.println("Ingrese un numero menor ");
            }
            intentos++;

        }while (numero != random) ;//que se siga repitiendo el ciclo siempre y cuando el numero ingresado sea distinto al ramdom(al generado)
        System.out.println("******** Adivinaste el numero que era: "+numero+ " en: "+intentos+" intentos ********");
    }
}