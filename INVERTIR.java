import java.util.Scanner;

public class INVERTIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Elementos en orden invertido:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
