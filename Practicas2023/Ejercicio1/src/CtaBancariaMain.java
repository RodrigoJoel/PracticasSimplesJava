import java.util.Scanner;

public class CtaBancariaMain {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular:");
        String titular = sc.nextLine();
        System.out.println("Ingrese la cantidad inicial:");
        double cantidadInicial = sc.nextDouble();

        CtaBancaria cuenta1 = new CtaBancaria(titular, cantidadInicial);
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Cantidad: " + cuenta1.getCantidad());

        System.out.println("Ingrese la cantidad a ingresar:");
        double cantidadIngreso = sc.nextDouble();
        cuenta1.ingresar(cantidadIngreso);
        System.out.println("Cantidad: " + cuenta1.getCantidad());

        System.out.println("Ingrese la cantidad a retirar:");
        double cantidadRetiro = sc.nextDouble();
        cuenta1.retirar(cantidadRetiro);
        System.out.println("Cantidad: " + cuenta1.getCantidad());
    }
}
