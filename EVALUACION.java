import java.util.Scanner;

public class EVALUACION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la calificación numérica (0-100): ");
        double calificacion = scanner.nextDouble();
        
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("La calificación debe estar entre 0 y 100.");
        } else {
            if (calificacion >= 90) {
                System.out.println("La calificación es: A");
            } else if (calificacion >= 80) {
                System.out.println("La calificación es: B");
            } else if (calificacion >= 70) {
                System.out.println("La calificación es: C");
            } else if (calificacion >= 60) {
                System.out.println("La calificación es: D");
            } else {
                System.out.println("La calificación es: F");
            }
        }

        scanner.close();
    }
}
