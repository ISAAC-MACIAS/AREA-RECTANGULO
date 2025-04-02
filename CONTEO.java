import java.util.Scanner;

public class CONTEO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();
        
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            int num = scanner.nextInt();
            
            if (num > 0) {
                mayoresQueCero++;
            } else if (num < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }
        
        System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
        System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);
        
        scanner.close();
    }
}
