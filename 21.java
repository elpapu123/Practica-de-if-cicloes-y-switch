import java.util.Scanner;

public class CalculadoraSueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese la antigüedad del empleado (en años): ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        double plusCategoria = 0;

        switch (categoria) {
            case 'A':
                plusCategoria = 1000;
                break;
            case 'B':
                plusCategoria = 2000;
                break;
            case 'C':
                plusCategoria = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return; // Salir del programa si la categoría es inválida
        }

        double sueldoNeto = sueldoBruto;

        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldoBruto * 0.1;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldoBruto * 0.3;
        }

        sueldoNeto += plusCategoria;

        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}
