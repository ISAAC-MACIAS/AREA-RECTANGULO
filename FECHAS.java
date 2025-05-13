import java.time.LocalDate;
import java.util.Scanner;

public class FECHAS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una fecha (YYYY-MM-DD): ");
        String entrada = sc.nextLine();

        LocalDate fecha = LocalDate.parse(entrada);
        LocalDate semanaDespues = fecha.plusWeeks(1);
        LocalDate mesAntes = fecha.minusMonths(1);

        System.out.println("Fecha original: " + fecha);
        System.out.println("Una semana después: " + semanaDespues);
        System.out.println("Un mes antes: " + mesAntes);
    }
}
