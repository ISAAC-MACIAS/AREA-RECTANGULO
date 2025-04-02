import java.util.Scanner;

public class CALCULADORA_BASICA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        char continuar;

        do {
            System.out.println("------ Calculadora Básica ------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Selecciona una opción (1-4): ");
            opcion = scanner.nextInt();

            System.out.print("Introduce el primer número: ");
            num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre 0.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("¡fin!");

        scanner.close();
    }
}
