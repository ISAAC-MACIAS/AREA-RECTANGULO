import java.util.Scanner;

public class PROMEDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();
        
        // Calcular la suma
        double suma = num1 + num2 + num3;
        
        // Calcular el promedio
        double promedio = suma / 3;
        
        // Mostrar resultados
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
        
        scanner.close();
    }
}
