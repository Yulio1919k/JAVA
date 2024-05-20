package Laborario_Nro_1;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese un Nombre: ");
        String nombre = ingreso.nextLine();
        int numeros_caracteres = nombre.length();
        System.out.println("El numero de caracteres es: "+numeros_caracteres);
    }
}
