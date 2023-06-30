import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Elija una opción (0: Piedra, 1: Papel, 2: Tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2 - Elija una opción (0: Piedra, 1: Papel, 2: Tijera): ");
        int jugador2 = scanner.nextInt();

        if (jugador1 == jugador2) {
            System.out.println("¡Es un empate!");
        } else if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("¡Jugador 1 gana!");
        } else {
            System.out.println("¡Jugador 2 gana!");
        }
    }
}
