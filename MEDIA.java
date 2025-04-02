import java.util.Scanner;

public class MEDIA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        System.out.println("Introduce números positivos. El programa terminará cuando ingreses un número negativo.");
        
        while (true) {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            suma += numero;
            contador++;
        }
        
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
        scanner.close();
    }
}
