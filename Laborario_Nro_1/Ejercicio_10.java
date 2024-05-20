package Laborario_Nro_1;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion;
        do {
            System.out.println("Hola, soy un BOT. ¿Cuál es tu nombre? (Escribe 'exit' para salir)");
            nombre = entrada.nextLine();
            if (nombre.equalsIgnoreCase("exit")) {
                System.out.println("¡Hasta luego!");
                break;
            }
            System.out.println("¡Hola " + nombre + "! ¿En qué puedo ayudarte?");
            System.out.println("Menú de Carreras:");
            System.out.println("------------------");
            System.out.println("1. Sistemas de Información");
            System.out.println("2. Tecnologías de la Información");
            System.out.println("3. Ingeniería de Software");
            System.out.println("4. Ciencias de la Computación");
            System.out.println("5. Realidad aumentada y videojuegos");
            System.out.println("6. Telecomunicaciones");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            String input = entrada.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("¡Hasta luego!");
                break;
            }
            opcion = Integer.parseInt(input);
            switch(opcion) {
                case 1:
                    System.out.println("Para la carrera de Sistemas de Información, las matrículas son el: 02-05-2024.");
                    break;
                case 2:
                System.out.println("Para la carrera de Tecnologias de la Información, las matrículas son el: 03-05-2024.");
                    break;
                case 3:
                System.out.println("Para la carrera de Ingenieria de Software, las matrículas son el: 04-05-2024.");
                    break;
                case 4:
                System.out.println("Para la carrera de Ciencias de la Computacion, las matrículas son el: 03-05-2024.");
                    break;
                case 5:
                System.out.println("Para la carrera de Realidad aumentada y videojuegos, las matrículas son el: 04-05-2024.");
                    break;
                case 6:
                System.out.println("Para la carrera de Telecomunicaciones, las matrículas son el: 05-05-2024.");
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
        } while (true);
    }
}