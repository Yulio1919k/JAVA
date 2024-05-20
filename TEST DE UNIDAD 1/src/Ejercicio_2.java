import java.util.Scanner;
public class Ejercicio_2 {
    static void Palabras(String verbo ){
        int num_palabras = verbo.split("\\s").length;
        System.out.println("Hay "+num_palabras+" de Palabras de "+ verbo);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese unas palabras: ");
        String p = entrada.nextLine();
        Palabras(p);
    }
}
