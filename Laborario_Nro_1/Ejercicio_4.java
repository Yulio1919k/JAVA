package Laborario_Nro_1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_4 {
    public static void main(String[] args){
        Scanner numero_entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = numero_entrada.nextDouble();
        double resultado = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de "+numero+" es: "+resultado);
    }
}
