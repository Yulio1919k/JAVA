package EJERCICIO4;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pila DonPila = new Pila();
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = leer.nextInt();
            if (numero >= 0 && numero <= 10) {
                DonPila.Apilar(numero);
            } else {
                System.out.println("Error");
                i--;
            }
        }
        System.out.println("\nEl Contenido de la pila:");
        DonPila.Imprimir();
        leer.close(); 
    }
}
