import java.util.Scanner;

public class PALINDROMO {

    public static boolean esPalindromo(String texto) {
        texto = texto.replaceAll("\\s+", "").toLowerCase(); 
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        sc.close();
    }
}
