import java.util.Scanner;
import java.text.Normalizer;

public class MANIPULACION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un texto largo:");
        String texto = sc.nextLine().toLowerCase();

        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        String palabra = "ingenieria";
        int contador = 0;
        int index = 0;

        while ((index = texto.indexOf(palabra, index)) != -1) {
            contador++;
            index += palabra.length();
        }

        System.out.println("La palabra 'ingenieria' aparece " + contador + " veces.");
    }
}
