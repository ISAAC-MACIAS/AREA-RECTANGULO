import java.util.Scanner;

public class AREAYPERIMETRO {

    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo: " + perimetro);

        sc.close();
    }
}
