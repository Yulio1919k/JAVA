import java.util.Scanner;
public class Ejercicio_4{
    public static void main(String[] args){
        double Fahrenheit, Celsius, Fahrenheit_2, Celsius_2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("TEMPERATURAS \n 1. Grados Celsius \n 2. Grado Fahrenheit \n");
        System.out.print("Ingrese uno de los dos elementos: ");
        int temperatura = entrada.nextInt();
        switch (temperatura){
            case 1:
                System.out.print("Ingrese la temperatura: ");
                Fahrenheit = entrada.nextDouble();
                Celsius = (Fahrenheit - 32) * 5/9;
                System.out.println("La temperatura de Grados Celsius es: "+Celsius);
                break;
            case 2:
                System.out.print("Ingrese la temperatura: ");
                Celsius_2 = entrada.nextDouble();
                Fahrenheit = (Celsius_2 * 9/5) + 32;
                System.out.println("La temperatura de Grados Fahrenheit es: "+Fahrenheit);
                break;
            default:
                break;
        }
    }
}
