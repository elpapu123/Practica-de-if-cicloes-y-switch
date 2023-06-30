import java.util.Scanner;

public class {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el caracter");
        char caracter = scanner.nextLine().charAt(0);
        
        if( caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')
            System.out.println("El caracter es vocal");
        else
            System.out.println("El caracter es conosonante");
    }
}
