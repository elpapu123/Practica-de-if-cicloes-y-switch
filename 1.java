import java.util.Scanner;

public class EvaluacionesAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de la primera evaluación: ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        double evaluacion3 = scanner.nextDouble();

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            System.out.println("El alumno está aprobado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno está reprobado con un promedio de " + promedio);
        }

        scanner.close();
    }
}
