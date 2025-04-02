import java.util.Scanner;

public class LETRAS_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        int contadorA = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contadorA++;
            }
        }
        
        System.out.println("La letra 'a' aparece " + contadorA + " veces en la palabra.");
        
        scanner.close();
    }
}
