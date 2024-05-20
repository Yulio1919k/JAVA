package Laborario_Nro_1;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int a = numero.nextInt();
        String b = String.valueOf(a);
        System.out.println(b+" ya es String");
    }
}