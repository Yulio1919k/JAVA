package EJERCICIO2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Cola DonCola = new Cola();
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el valor "+(i+1)+": ");
            int numeros = leer.nextInt();
            DonCola.Encolar(numeros);
        }

        System.out.print("Cola Ingresados: ");
        DonCola.Imprimir();

        System.out.print("Cola Ordenada: ");
        DonCola.OrdenarAscendente();
        DonCola.Imprimir();
    }
}
