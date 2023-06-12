import java.util.Scanner;

public class PersonaMain {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese género:");
        String genero = sc.nextLine();

        Persona persona1 = new Persona(nombre, edad, genero);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
    }
}

