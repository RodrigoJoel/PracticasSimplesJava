//Crea una clase Persona que tenga dos atributos (nombre y edad) y un método adicional para imprimir la información
//de la persona. Luego, crea dos subclases Estudiante y Empleado que hereden de Persona y agreguen atributos y
//métodos adicionales.
public class Persona {

    private String nombre;
    private int edad;
    private String genero;


    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("El nombre de la persona es: " + nombre + " la edad es : " + edad + " y el genero es : " + genero);
    }
}

