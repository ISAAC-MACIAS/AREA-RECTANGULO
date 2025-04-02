import java.util.Scanner;

public class ADIVINADOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        
        int suposicion = 0;
        
        int intentos = 0;
        
        System.out.println("He generado un número entre 1 y 100. Intenta adivinarlo.");
        
        while (suposicion != numeroAleatorio) {
            System.out.print("Introduce tu suposición: ");
            suposicion = scanner.nextInt();
            intentos++;
            
            if (suposicion < numeroAleatorio) {
                System.out.println("Tu suposición es demasiado baja. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Tu suposición es demasiado alta. Intenta de nuevo.");
            }
        }
        
        System.out.println(" Has adivinado el número en " + intentos + " intentos.");
        
        scanner.close();
    }
}
