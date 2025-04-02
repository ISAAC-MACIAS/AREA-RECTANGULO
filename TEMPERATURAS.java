import java.util.Scanner;

public class TEMPERATURAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        System.out.println("Seleccione la opción de conversión:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Ingrese su opción (1 o 2): ");
        int opcion = scanner.nextInt();
        
        double resultado;

        switch (opcion) {
            case 1: // Convertir a Fahrenheit
                resultado = (celsius * 9/5) + 32;
                System.out.println(celsius + " grados Celsius es igual a " + resultado + " grados Fahrenheit.");
                break;
            case 2: // Convertir a Kelvin
                resultado = celsius + 273.15;
                System.out.println(celsius + " grados Celsius es igual a " + resultado + " grados Kelvin.");
                break;
            default:
                System.out.println("Opción inválida. Debe seleccionar 1 o 2.");
        }
        
        scanner.close();
    }
}
