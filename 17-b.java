import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        int sumaPares = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            int paridad = resultado % 2;  // Calculamos el residuo de la división por 2

            sumaPares += resultado * (1 - paridad);  // Si es impar, se suma 0. Si es par, se suma el resultado.
        }

        System.out.println("Suma de los valores pares: " + sumaPares);
    }
}
