import java.util.Scanner;

public class NOMBRES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        while (true) {
            System.out.print("Ingresar nombre completo en minúsculas o escribir 'salir' para terminar: ");
            nombre = sc.nextLine();

            if (nombre.equals("salir")) {
                break;
            }

            System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        }

        sc.close();
        System.out.println("Programa terminado.");
    }
}
