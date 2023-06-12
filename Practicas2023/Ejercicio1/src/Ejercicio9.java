import java.util.Scanner;

//Pedir al usuario que ingrese un número y luego mostrar si es positivo, negativo o cero.
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");//solicitamos el ingreso de un numero al usuario
        int numero = scanner.nextInt();//guardamos lo ingresado en la variable numero
        if (numero>0){//si el numero ingresado es mayor a cero
            System.out.println("El numero ingresado es positivo");//imprimimos por pantalla que el numero es positivo
        } else if (numero <0) {//si el numero es menor a cero
            System.out.println("El numero ingresado es negativo");//imprimimos por pantalla que el numero es negativo
        }else {//caso contrario donde el numero ingresado sea cero
            System.out.println("El numero ingresado es 0");//imprimimos por pantalla que el numero ingresado es igual a cero
        }
    }
}
