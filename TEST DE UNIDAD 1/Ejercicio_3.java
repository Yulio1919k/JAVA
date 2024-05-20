import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();
        int fact = 1;
        for (int a = 1; a <= num; a++) {
            fact = fact * a;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
    }
}
