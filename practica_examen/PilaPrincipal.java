package practica_examen;
import java.util.Scanner;
public class PilaPrincipal{
    public static void main(String[] args) {
        Pila dueñopila = new Pila();
        Scanner leer = new Scanner(System.in);
        System.out.println("\nIngrese un numero: ");
        int numero = leer.nextInt();
        dueñopila.apilar(numero);
        int z = dueñopila.desapilar();
        leer.close();
        System.out.println("El numero de la Pila es: "+z);
    }
}