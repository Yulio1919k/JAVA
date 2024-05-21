import java.util.Scanner;
public class Juego_Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBingoNumbers = 15;
        int minBingoNumber = 1;
        int maxBingoNumber = 75;
        int[] numeros_Ingresados = new int[maxBingoNumbers];
        System.out.print("\n¡Bienvenido al juego de Bingo!\n");
        int ficha = 0;
        while (ficha < maxBingoNumbers) {
            System.out.print("Ingrese el número de la ficha " + (ficha + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < minBingoNumber || numero > maxBingoNumber) {
                System.out.println("\n¡Número fuera de rango! Por favor, ingrese un número entre " + minBingoNumber + " y " + maxBingoNumber + ".\n");
                continue;
            }
            if (ya_Esta_Ingresado(numeros_Ingresados, ficha, numero)) {
                System.out.print("\n¡Ese número ya fue ingresado! Intente con otro.\n");
            } else {
                numeros_Ingresados[ficha] = numero;
                ficha++; 
                System.out.print("\n número ingresado correctamente.\n");
            }
        }
        if (ficha == maxBingoNumbers) {
            System.out.print("\n¡BINGO!\n");
        } else {
            System.out.print("\n No hay bingo aún. Siga jugando. \n");
        }
        scanner.close();
    }
    public static boolean ya_Esta_Ingresado(int[] array, int length, int number) {
        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}