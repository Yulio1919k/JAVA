package Laborario_Nro_1;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner numero_ingresado = new Scanner(System.in);
        System.out.print("Ingrese número para redondear: ");
        if (numero_ingresado.hasNextDouble()) {
            double numero = numero_ingresado.nextDouble();
            double redondeo = Math.ceil(numero);
            System.out.println("El número redondeado es: " + redondeo);
        } else {
            System.out.println("La entrada no es un número válido.");
        }
        numero_ingresado.close();
    }
}
