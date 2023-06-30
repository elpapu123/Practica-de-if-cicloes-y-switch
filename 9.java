import java.util.Scanner;

public class DeterminarGanador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Ingrese su jugada (0 para piedra, 1 para papel, 2 para tijera): ");
        int jugadaJugador1 = scanner.nextInt();

        System.out.print("Jugador 2 - Ingrese su jugada (0 para piedra, 1 para papel, 2 para tijera): ");
        int jugadaJugador2 = scanner.nextInt();

        boolean jugador1Gana = (jugadaJugador1 == 0 && jugadaJugador2 == 2) ||
                (jugadaJugador1 == 1 && jugadaJugador2 == 0) ||
                (jugadaJugador1 == 2 && jugadaJugador2 == 1);

        boolean jugador2Gana = (jugadaJugador2 == 0 && jugadaJugador1 == 2) ||
                (jugadaJugador2 == 1 && jugadaJugador1 == 0) ||
                (jugadaJugador2 == 2 && jugadaJugador1 == 1);

        if (jugador1Gana) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else if (jugador2Gana) {
            System.out.println("¡Jugador 2 es el ganador!");
        } else {
            System.out.println("Es un empate. ¡Nadie gana!");
        }
    }
}
