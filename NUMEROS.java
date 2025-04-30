import java.util.Scanner;

public class NUMEROS {

    public static void main(String[] args) {
        int[] numeros = leerNumeros();
        contarParesImpares(numeros);
    }

    public static int[] leerNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static void contarParesImpares(int[] numeros) {
        int pares = 0;
        int impares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
