import java.util.Scanner;

public class CADENA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Tienen la misma longitud.");
        } else {
            System.out.println("Tienen diferente longitud.");
        }

        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido  es igual.");
        } else {
            System.out.println("El contenido es diferente.");
        }
    }
}
