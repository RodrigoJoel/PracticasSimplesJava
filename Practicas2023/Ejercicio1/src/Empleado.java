public class Empleado extends Persona {

    private double salario;//se declara porque es propiode esta clase y no lo posee la clase padre o "superior"

    public Empleado(String nombre, int edad, double salario, String genero) {
        super(nombre, edad, genero);//super cuando viene de la clase padre, en este caso Persona que ya posee los atributos nombre, edad
        this.salario = salario;//y aqui se agrega el metodo salario
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + salario);
    }
}