import java.util.Scanner;

public class IMPARES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int i = 1;
            
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            do {
                if (i % 2 != 0) { 
                    System.out.println(i);
                }
                i++; 
            } while (i <= numero); 
        } else {
            System.out.println("Por favor, ingresa un número entero positivo.");
        }

        scanner.close();
    }
}
