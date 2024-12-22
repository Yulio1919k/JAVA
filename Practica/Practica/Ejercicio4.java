package Practica;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Diseñe un programa en Java que permita el ingreso de 10 números y muestre 
        cuantos números mayores a 10 se ingresaron.
         */
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];
        int numeros_mayores = 0;
        for(int i= 0; i<10; i++){ 
        System.out.print("Ingrese el numero "+(i+1)+": ");
        num[i] = Integer.parseInt(entrada.nextLine());
        }
        for(int i= 0; i<10; i++){
            if(num[i] >= 10 ){
                numeros_mayores++;
            }
        }
        System.out.println("Hay "+numeros_mayores+" numero que son mayores a 10");
    }
}