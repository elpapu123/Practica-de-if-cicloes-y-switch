import java.util.Scanner;

public class Categoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        if (categoria.equals("a")) {
            System.out.println("Hijo");
        } else if (categoria.equals("b")) {
            System.out.println("Padres");
        } else if (categoria.equals("c")) {
            System.out.println("Abuelos");
        } else {
            System.out.println("Categoría inválida");
        }
    }
}
