import java.util.Scanner;

public class PREFERENCIAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de un artista, película, serie, deporte, superhéroe, postre o color de su preferencia:");
        String preferencia = scanner.nextLine().toLowerCase(); 
        String informacion;
        
        switch (preferencia) {
            case "queen":
                informacion = "Queen es una banda de rock británica formada en 1970, conocida por su estilo musical único y la icónica voz de Freddie Mercury.";
                break;
            case "star wars":
                informacion = "Star Wars es una icónica saga de ciencia ficción creada por George Lucas, que ha tenido un enorme impacto cultural desde su estreno en 1977.";
                break;
            case "los simpson":
                informacion = "Los Simpson es una serie animada estadounidense creada por Matt Groening, conocida por su crítica social y sus personajes icónicos.";
                break;
            case "futbol":
                informacion = "El fútbol es el deporte más popular del mundo, jugado por dos equipos de 11 jugadores que intentan meter un balón en la portería del equipo contrario.";
                break;
            case "batman":
                informacion = "Batman es un superhéroe de DC Comics, creado por Bob Kane y Bill Finger, que lucha contra el crimen en la ciudad de Gotham usando sus habilidades y tecnología.";
                break;
            case "pastel":
                informacion = "El pastel es un postre dulce y horneado, elaborado con harina, azúcar, huevos, y otros ingredientes, a menudo decorado con glaseado o frutas.";
                break;
            case "morado":
                informacion = "El color morado es un color que se encuentra entre el azul y el rojo, y es a menudo asociado con la realeza, el misterio y la espiritualidad.";
                break;
            default:
                informacion = "Lo siento, no tengo información sobre esa preferencia.";
        }
        
        System.out.println(informacion);
        
        scanner.close();
    }
}
