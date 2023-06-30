import java.util.Scanner;

public class CantidadDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un mes: ");
        String nombreMes = scanner.nextLine().toLowerCase();

        int cantidadDias;

        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            default:
                System.out.println("Nombre de mes inválido.");
                return; // Termina el programa si el nombre del mes es inválido
        }

        System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
    }
}
