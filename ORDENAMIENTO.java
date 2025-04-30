import java.util.Scanner;

public class ORDENAMIENTO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea agregar: ");
        int tamaño = scanner.nextInt();
        int[] numeros = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("orden ascendente:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); // Salto de línea final
    }
}
