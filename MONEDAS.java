import java.util.Scanner;

public class MONEDAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double pesosMexicanos = scanner.nextDouble();
        
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        
        System.out.print("Ingrese el número de la opción (1-10): ");
        int opcion = scanner.nextInt();
        
        double resultado;
        
        switch (opcion) {
            case 1: // Dólar (USD)
                resultado = pesosMexicanos * 0.054; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " USD.");
                break;
            case 2: // Euro (EUR)
                resultado = pesosMexicanos * 0.048; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " EUR.");
                break;
            case 3: // Baht (THB)
                resultado = pesosMexicanos * 1.85; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " THB.");
                break;
            case 4: // Yen (JPY)
                resultado = pesosMexicanos * 7.5; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " JPY.");
                break;
            case 5: // Won (KRW)
                resultado = pesosMexicanos * 71.0; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " KRW.");
                break;
            case 6: // Dólar Australiano (AUD)
                resultado = pesosMexicanos * 0.078; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " AUD.");
                break;
            case 7: // Sol (PEN)
                resultado = pesosMexicanos * 0.21; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " PEN.");
                break;
            case 8: // Dólar Canadiense (CAD)
                resultado = pesosMexicanos * 0.073; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " CAD.");
                break;
            case 9: // Bolívar (VES)
                resultado = pesosMexicanos * 1.3; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " VES.");
                break;
            case 10: // Peso Argentino (ARS)
                resultado = pesosMexicanos * 11.0; // Tasa de cambio ejemplo
                System.out.println(pesosMexicanos + " MXN son " + resultado + " ARS.");
                break;
            default:
                System.out.println("Opción inválida. Debe ingresar un número entre 1 y 10.");
        }
        
        scanner.close();
    }
}
