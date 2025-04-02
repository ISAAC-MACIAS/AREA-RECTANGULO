import java.util.Scanner;

public class VOCALES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce letras. El programa terminará cuando ingreses un espacio.");
        
        String input;
        
        while (true) {
            System.out.print("Ingresa una letra: ");
            input = scanner.nextLine(); 
            
            if (input.trim().isEmpty()) {
                break;
            }
            
            char letra = input.charAt(0);
            
            letra = Character.toLowerCase(letra);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("La letra '" + letra + "' es una vocal.");
            } else {
                System.out.println("La letra '" + letra + "' es una consonante.");
            }
        }
        
        System.out.println("Programa terminado.");
        
        scanner.close();
    }
}
