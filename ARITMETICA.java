import java.util.Scanner;

public class ARITMETICA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Introduce la diferencia entre los números: ");
        int diferencia = scanner.nextInt();

        System.out.print("Introduce el número máximo hasta donde debe llegar la secuencia: ");
        int numeroMaximo = scanner.nextInt();

        if (numeroMaximo >= primerNumero) {
            int numeroActual = primerNumero;
            
            System.out.println("Secuencia Aritmética:");
            do {
                System.out.println(numeroActual); 
                numeroActual += diferencia; 
            } while (numeroActual <= numeroMaximo); 
        } else {
            System.out.println("El número máximo debe ser mayor o igual al primer número.");
        }

        scanner.close();
    }
}
