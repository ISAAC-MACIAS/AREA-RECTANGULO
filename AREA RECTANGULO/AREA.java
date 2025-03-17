import java.util.Scanner;

public class AREA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la base del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        // Solicitar al usuario la altura del rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular el área
        double area = base * altura;
        
        // Calcular el perímetro
        double perimetro = 2 * (base + altura);
        
        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        
        scanner.close();
    }
}
    