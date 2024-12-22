package EJERCICIO1;

import java.util.Scanner;

public class Ejercicio1{
public static void main(String[] args) {
    Pila DonPila = new Pila();
    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese una Palabra: ");
    String palabra = leer.nextLine();

    for (String letra : palabra.split("")) {
        DonPila.Apilar(letra);
    }

    String cadenaInvertida = "";
    while (!DonPila.PilaVacia()) {
    cadenaInvertida += DonPila.Desapilar();
}
    System.out.println("Cadena invertida: " + cadenaInvertida);

}
}