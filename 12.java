import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        String docena = determinarDocenaAnd(numero);

        System.out.println(docena);

        scanner.close();
    }

    public static String determinarDocenaAnd(int numero) {
        if (numero >= 1 && numero <= 12) {
            return "El número " + numero + " pertenece a la primer docena.";
        } else if (numero >= 13 && numero <= 24) {
            return "El número " + numero + " pertenece a la segunda docena.";
        } else if (numero >= 25 && numero <= 36) {
            return "El número " + numero + " pertenece a la tercer docena.";
        } else {
            return "El número " + numero + " está fuera de rango.";
        }
    }
}
