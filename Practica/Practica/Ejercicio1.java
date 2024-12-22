package Practica;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        // Diseñe un programa en Java que permita el ingreso de 20 numeros y muestre
        // la suma de los numeros impares que se ingresaron
        Scanner leer = new Scanner(System.in);
        int Suma = 0;
        for(int i = 0; i <20; i++){
        System.out.print("Ingrese un numero "+(i+1)+": ");
        int n = leer.nextInt();
        if ((n%2)==1) {
         Suma = Suma+n;
         System.out.println("La suma es de "+Suma);            
            }
        }
    }
}