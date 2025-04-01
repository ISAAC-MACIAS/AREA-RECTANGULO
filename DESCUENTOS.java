import java.util.Scanner;

public class DESCUENTOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        
        double precioFinal;

        if (precioOriginal <= 100) {
            precioFinal = precioOriginal; // Sin descuento
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            precioFinal = precioOriginal - (precioOriginal * 0.10); // 10% de descuento
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            precioFinal = precioOriginal - (precioOriginal * 0.20); // 20% de descuento
        } else {
            precioFinal = precioOriginal - (precioOriginal * 0.25); // 25% de descuento
        }
        
        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}
