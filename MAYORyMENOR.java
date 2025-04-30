import java.util.Scanner;

public class MAYORyMENOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        System.out.print("Ingrese el número 1: ");
        numeros[0] = scanner.nextInt();
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 8; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
