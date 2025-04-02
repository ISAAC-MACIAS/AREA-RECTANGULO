import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número para calcular su factorial: ");
        int num = scanner.nextInt();
        
        long factorial = 1; 
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
        
        scanner.close();
    }
}
