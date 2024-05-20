package Laborario_Nro_1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_2 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();
            double logNatural = Math.log(numero);
            System.out.println("Logaritmo natural: " + logNatural);
            double logBase10 = Math.log10(numero);
            System.out.println("Logaritmo base 10: " + logBase10);
            double ceil = Math.ceil(numero);
            System.out.println("Ceil: " + ceil);
            double floor = Math.floor(numero);
            System.out.println("Floor: " + floor);
            long round = Math.round(numero);
            System.out.println("Round: " + round);
        }
    }