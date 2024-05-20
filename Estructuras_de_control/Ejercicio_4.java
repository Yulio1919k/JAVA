package Estructuras_de_control;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Holaaa, Soy un BOT, dime ¿Como te llamas?: ");
        String nombre = entrada.nextLine();
        System.out.println("¡Hola " + nombre + "! ¿En qué puedo ayudarte?");
        System.out.println("Menú de Carreras:");
        System.out.println("1. Sistemas de Información");
        System.out.println("2. Tecnologías de la Información");
        System.out.println("3. Ingeniería de Software");
        System.out.println("4. Ciencias de la Computación");
        System.out.println("5. Realidad aumentada y videojuegos");
        System.out.println("6. Telecomunicaciones");
        System.out.println("7. Salir");
        System.out.print("Elija la Opción: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Para la carrera de Sistemas de Información, las matriculas son el: 02-05-2024.");
                break;
            case 2:
                System.out.println("Para la carrera de Tecnologias de la Información, las matriculas son el: 03-05-2024.");
                break;
            case 3:
                System.out.println("Para la carrera de Ingenieria de Software, las matrículas son el: 04-05-2024.");
                break;
            case 4:
                System.out.println("Para la carrera de Ciencias de la Computación, las matrículas son el: 05-05-2024.");
                break;
            case 5:
                System.out.println("Para la carrera de Realidad aumentada y videojuegos, las matrículas son el: 06-05-2024.");
                break;
            case 6:
                System.out.println("Para la carrera de Telecomunicaciones, las matriculas son el: 07-05-2024.");
                break;
            case 7:
                System.out.println("¡Muchas gracias por usar nuestro servicio!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
