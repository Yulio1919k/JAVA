package Practica;
import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
         // Diseñe un programa en Java que permita el ingreso de 20 numeros y 
        // luego de ingresar los numeros, genere un vector con los numeros pares que se ingresen
        Scanner leer = new Scanner(System.in);
        int Su = 0;
        int[] numero = new int[20];
        int[] numeropares = new int[20];
        int contador = 0;
        for(int i = 0; i<20; i++){
            System.out.print("Ingrese un numero "+(i+1)+": ");
            numero[i] = leer.nextInt();
}
        for(int i = 0; i<20; i++){
        if((numero[i]%2)==0){
            numeropares[contador] = numero[i];
            contador++;
}
}
        for(int i = 0; i< contador; i++){
            System.out.println("El vector par es: "+numeropares[i]);
}   
}
}