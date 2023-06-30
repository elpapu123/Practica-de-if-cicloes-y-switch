import java.util.Scanner;

public class IdentificarPuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto del participante: ");
        int puesto = scanner.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("El primero obtiene la medalla de oro.");
                break;
            case 2:
                System.out.println("El segundo obtiene la medalla de plata.");
                break;
            case 3:
                System.out.println("El tercero obtiene la medalla de bronce.");
                break;
            default:
                System.out.println("Siga participando.");
                break;
        }
    }
}
