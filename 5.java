import java.util.Scanner;

public class PuestosTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();

        if (puesto == 1) {
            System.out.println("Medalla de oro");
        } else if (puesto == 2) {
            System.out.println("Medalla de plata");
        } else if (puesto == 3) {
            System.out.println("Medalla de bronce");
        } else {
            System.out.println("Siga participando");
        }
    }
}
