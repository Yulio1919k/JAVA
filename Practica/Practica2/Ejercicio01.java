package Practica2;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
    //Diseñe un programa que permita en el ingrese n número en un vector y muestre la 
    //suma de los numeros pares
    Scanner leer = new Scanner(System.in);
    int Suma = 0;
    System.out.print("Ingrese cuantos numeros desea: ");  
    int n = leer.nextInt();
    int[] numeros = new int[n];
    //Ingreso del vector
    for (int i = 0; i < n; i++) {
        System.out.print("Ingrese un numero "+(i+1)+": ");
        numeros[i] = leer.nextInt();
    }     
    for (int i = 0; i < n; i++) {
        if ((numeros[i]% 2)== 0) { 
            Suma += numeros[i]; 
        }    
    }
    System.out.print("\nLa suma de pares es: "+Suma);
    leer.close();
    }
    }
    

