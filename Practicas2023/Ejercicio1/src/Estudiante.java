//Crea una clase Estudiante que tenga tres atributos (nombre, edad y promedio) y métodos para obtener y establecer cada uno de ellos.
// Agrega un método adicional para determinar si el estudiante ha aprobado o reprobado en función de su promedio.
public class Estudiante {

    private String nombre;
    private int edad;
 //   private double promedio;

    public Estudiante(String nombre, int edad,/*, double promedio*/double v) {
        this.edad = edad;
        this.nombre = nombre;
 //       this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 /*   public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
*/
  /*  public double aprobo() {
        if (promedio >= 6) {
            System.out.println("el estudiante aprobo");
        }else {
            System.out.println("El estudiante no aprobo");
        }
        return 0;
    }*/
}
