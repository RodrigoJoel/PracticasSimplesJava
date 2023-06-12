import java.util.ArrayList;

public class Banco {
    private ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
    }

    public void eliminarCuenta(CuentaBancaria cuenta) {
        this.cuentas.remove(cuenta);
    }

    public void mostrarCuentas() {
        System.out.println("Lista de cuentas bancarias:");
        for (CuentaBancaria cuenta : this.cuentas) {
            System.out.println(cuenta);
        }
    }

    public CuentaBancaria getCuenta(String numeroCuenta) {
        return null;
    }
}

