import java.util.Scanner;

public class DeterminarVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        boolean esVocal = (caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u');

        if (esVocal) {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado no es una vocal.");
        }
    }
}
