import java.util.Scanner;

public class MASA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        // Solicitar la altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        // Calcular el Índice de Masa Corporal (IMC)
        double imc = peso / (altura * altura);
        
        // Mostrar el resultado
        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);
        
        // Clasificación del IMC según la OMS
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
        
        scanner.close();
    }
}
