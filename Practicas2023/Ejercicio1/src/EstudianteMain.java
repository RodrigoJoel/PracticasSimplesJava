import java.util.Scanner;

public class EstudianteMain {

    static Scanner scanner = new Scanner(System.in);

    private static String rodrigo;
    static double nota;

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(rodrigo,29, 8.0);
//        estudiante.aprobo();
        System.out.println("Ingresa el promedio del estudiante: ");
        nota = scanner.nextDouble();
        if (nota >=6){
            System.out.println("El estudiante aprobo");
        }else{
            System.out.println("El estudiante no aprobo");
        }
    }

}
