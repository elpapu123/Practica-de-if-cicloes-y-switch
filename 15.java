public class Auto {
    private char clase;

    public Auto(char clase) {
        this.clase = clase;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Características del auto:");

        switch (clase) {
            case 'a':
                System.out.println("Clase: A");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                break;
            case 'b':
                System.out.println("Clase: B");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                System.out.println("Cierre centralizado: Sí");
                System.out.println("Aire acondicionado: Sí");
                break;
            case 'c':
                System.out.println("Clase: C");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                System.out.println("Cierre centralizado: Sí");
                System.out.println("Aire acondicionado: Sí");
                System.out.println("Airbag: Sí");
                break;
            default:
                System.out.println("Clase no válida");
        }
    }

    public static void main(String[] args) {
        Auto autoA = new Auto('a');
        autoA.mostrarCaracteristicas();

        Auto autoB = new Auto('b');
        autoB.mostrarCaracteristicas();

        Auto autoC = new Auto('c');
        autoC.mostrarCaracteristicas();
    }
}
