import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do {
            // Solicitar datos de la cuenta
            System.out.println("Ingrese el número de cuenta:");
            String numeroCuenta = scanner.next();
            System.out.println("Ingrese el titular de la cuenta:");
            String titular = scanner.next();
            System.out.println("Ingrese el saldo inicial:");
            double saldo = scanner.nextDouble();

            // Agregar cuenta
            banco.agregarCuenta(new CuentaBancaria(numeroCuenta, titular, saldo));

            // Preguntar si quiere continuar
            System.out.println("¿Desea ingresar otra cuenta? (S/N)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        } while (continuar);

        System.out.println("Desea realizar otra operacion?");
        String resp = scanner.nextLine();
        if(resp.equalsIgnoreCase("N")){
            continuar = false;
        }else {
            System.out.println("");
        }
        // Mostrar cuentas
        banco.mostrarCuentas();

        // Realizar operaciones en cuenta
        System.out.println("Ingrese el número de cuenta para hacer operaciones:");
        String numeroCuenta = scanner.next();
        CuentaBancaria cuenta = banco.getCuenta(numeroCuenta);
        if (cuenta != null) {
            System.out.println("Ingrese el tipo de operación (1 = depositar, 2 = retirar):");
            int tipoOperacion = scanner.nextInt();
            System.out.println("Ingrese la cantidad:");
            double cantidad = scanner.nextDouble();
            if (tipoOperacion == 1) {
                cuenta.depositar(cantidad);
            } else if (tipoOperacion == 2) {
                cuenta.retirar(cantidad);
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }

        // Mostrar cuentas después de las operaciones
        banco.mostrarCuentas();

        // Eliminar cuenta
        System.out.println("Ingrese el número de cuenta a eliminar:");
        String numeroCuentaEliminar = scanner.next();
        CuentaBancaria cuentaEliminar = banco.getCuenta(numeroCuentaEliminar);
        if (cuentaEliminar != null) {
            banco.eliminarCuenta(cuentaEliminar);
        } else {
            System.out.println("Cuenta no encontrada.");
        }

        // Mostrar cuentas después de la eliminación
        banco.mostrarCuentas();
    }
}
