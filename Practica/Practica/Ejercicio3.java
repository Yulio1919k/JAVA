package Practica;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        //Diseñe un programa en Java que permita el ingreso de 
        //10 numeros y muestre en pantalla cuantos son primos
        Scanner entrada = new Scanner(System.in);
        int numeroprimos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            if (esPrimo(entrada.nextInt())) numeroprimos++;
        }
        System.out.println("Hay " + numeroprimos + " números primos");
    }
    private static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) 
            if (num % i == 0) return false;
        return true;
    }
}