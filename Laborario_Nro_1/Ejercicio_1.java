package Laborario_Nro_1;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        //Ejercico Nro 1

        System.out.println("Ingrese el primer nombre para verificar:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el segundo nombre para verificar:");
        String nombre2 = entrada.nextLine();
        String c_nombre = nombre.substring(0, 2);
        String c_nombre2 = nombre2.substring(0, 2);
        if (c_nombre.equalsIgnoreCase(c_nombre2)) {
            System.out.println("Los dos primeros caracter de " + nombre + "es la misma que " + nombre2 + " de " + c_nombre2);
        } else {
            System.out.println("El caracter no son iguales");

        }
    }
}
