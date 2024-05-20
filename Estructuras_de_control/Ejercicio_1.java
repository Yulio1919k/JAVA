package Estructuras_de_control;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        int n_docencia, n_practica, n_autonoma, n_examen, calificacion;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el Nombre del Estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el Apellido del Estudiante: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese la nota de docencia: ");
        n_docencia = entrada.nextInt();
        System.out.print("Ingrese la nota de practica: ");
        n_practica = entrada.nextInt();
        System.out.print("Ingrese la nota autonoma: ");
        n_autonoma = entrada.nextInt();
        System.out.print("Ingrese la nota del examen: ");
        n_examen = entrada.nextInt();
        calificacion = n_docencia + n_practica + n_autonoma + n_examen;
        if (calificacion > 70) {
            System.out.println("El estudiante " + nombre + " " + apellido + " está Aprobado");
        } else {
            System.out.print("El estudiante " + nombre + " " + apellido + " está Reprobado");
        }
    }
}