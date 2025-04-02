import java.util.Scanner;

public class CONTADOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        int contadorDigitos = 0;
        
        numero = Math.abs(numero);
        
        if (numero == 0) {
            contadorDigitos = 1;
        } else {
            
            while (numero > 0) {
                numero = numero / 10; 
                contadorDigitos++; 
            }
        }
        
        System.out.println("El número tiene " + contadorDigitos + " dígitos.");
        
        scanner.close();
    }
}
