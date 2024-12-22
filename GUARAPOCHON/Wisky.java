package GUARAPOCHON;
import java.util.Scanner;
public class Wisky {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = entrada.nextInt();
        if(a % 2 !=1){
            System.out.println("es par");
        }else{
            System.out.println("es Impar");
        }
    }
}