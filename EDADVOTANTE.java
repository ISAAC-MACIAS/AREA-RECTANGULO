import java.util.Scanner;

public class EDADVOTANTE {

    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }

        sc.close();
    }
}
