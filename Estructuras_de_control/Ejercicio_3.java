package Estructuras_de_control;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        double producto_1, producto_2, producto_3, valor_total, iva1, iva2, iva3, total_iva1, total_iva2, total_iva3;
        String name_producto_1, name_producto_2, name_producto_3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto 1: ");
        name_producto_1 = entrada.nextLine();
        System.out.print("Ingrese el nombre del producto 2: ");
        name_producto_2 = entrada.nextLine();
        System.out.print("Ingrese el nombre del producto 3: ");
        name_producto_3 = entrada.nextLine();

        System.out.print("Ingrese el precio del primer producto: ");
        producto_1 = entrada.nextDouble();
        System.out.print("Ingrese el precio del segundo producto: ");
        producto_2 = entrada.nextDouble();
        System.out.print("Ingrese el precio del tercer producto: ");
        producto_3 = entrada.nextDouble();

        iva1 = producto_1 * 0.19;
        iva2 = producto_2 * 0.16;
        iva3 = producto_3 * 0.14;

        total_iva1 = producto_1 + iva1;
        total_iva2 = producto_2 + iva2;
        total_iva3 = producto_3 + iva3;

        valor_total = total_iva1 + total_iva2 + total_iva3;

        System.out.println("Lista de Descuento\n");
        System.out.println("Lunes: 5%\nMartes: 10%\nMiércoles: 15%\nJueves: 20%\nViernes: 30%\nSábado: 45%\nDomingo: 50%\n");
        System.out.print("Ingrese un día de la semana usando 1,2,3,4,5,6,7: ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El día es: Lunes");
                if (valor_total > 100) {
                    valor_total = (valor_total * 5) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 5% es de: " + valor_total);
                }
                break;
            case 2:
                System.out.println("El día es: Martes");
                if (valor_total > 150) {
                    valor_total = (valor_total * 10) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 10% es de: " + valor_total);
                }
                break;
            case 3:
                System.out.println("El día es: Miércoles");
                if (valor_total > 200) {
                    valor_total = (valor_total * 15) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 15% es de: " + valor_total);
                }
                break;
            case 4:
                System.out.println("El día es: Jueves");
                if (valor_total > 250) {
                    valor_total = (valor_total * 20) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 20% es de: " + valor_total);
                }
                break;
            case 5:
                System.out.println("El día es: Viernes");
                if (valor_total > 300) {
                    valor_total = (valor_total * 30) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 30% es de: " + valor_total);
                }
                break;
            case 6:
                System.out.println("El día es: Sábado");
                if (valor_total > 400) {
                    valor_total = (valor_total * 45) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 45% es de: " + valor_total);
                }
                break;
            case 7:
                System.out.println("El día es: Domingo");
                if (valor_total > 500) {
                    valor_total = (valor_total * 50) / 100;
                    System.out.println("Los productos de la\n" + name_producto_1 + " con iva es de: " + total_iva1 + "\n" + name_producto_2 + " con iva es de: " + total_iva2 + "\n" + name_producto_3 + " con iva es de: " + total_iva3 + "\nEl descuento es del 50% es de: " + valor_total);
                }
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
