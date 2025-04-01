import java.util.Scanner;

public class CALCULADORA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la calificación de los parciales (0 a 100): ");
        double parciales = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del proyecto (0 a 100): ");
        double proyecto = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del examen final (0 a 100): ");
        double examenFinal = scanner.nextDouble();
        
        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal < 0 || examenFinal > 100) {
            System.out.println("Las calificaciones deben estar en el rango de 0 a 100.");
        } else {

            double calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
            System.out.println("La calificación final del estudiante es: " + calificacionFinal);
        }

        scanner.close();
    }
}
