package Laborario_Nro_1;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio_3 {
    //Ejercicio Nro 3
    public static void main(String[] args){
    Scanner entrada_numero = new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    double numero =  entrada_numero.nextDouble();
    double resultado = Math.pow(numero, 3);
    System.out.println("El valor es: "+resultado);
    }
}
