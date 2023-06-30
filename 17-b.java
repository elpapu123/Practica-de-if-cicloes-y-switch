import java.util.Scanner;

public class SumaValoresPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        int sumaPares = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            sumaPares += (numero % 2 == 0) ? numero : 0;
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
