package Estructuras_de_control;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        double producto_1, producto_2, producto_3, valor_total, iva_1, iva_2, iva_3, total_iva1, total_iva2, total_iva3;
        String name_producto_1, name_producto_2, name_producto_3;
        Scanner entrada = new Scanner(System.in);
        //Ingreso del los nombre de los Productos
        System.out.print("Ingrese el Primer nombre del producto: ");
        name_producto_1 = entrada.nextLine();
        System.out.print("Ingrese el Segundo nombre del producto: ");
        name_producto_2 = entrada.nextLine();
        System.out.print("Ingrese el Tercer nombre del producto: ");
        name_producto_3 = entrada.nextLine();
        //Ingreso de los valores de los Productos
        System.out.print("Ingrese el precio del primer producto: ");
        producto_1 = entrada.nextDouble();
        System.out.print("Ingrese el precio del segundo producto: ");
        producto_2 = entrada.nextDouble();
        System.out.print("Ingrese el precio del tercer producto: ");
        producto_3 = entrada.nextDouble();
        //Calcular el iva de los productos
        iva_1 = (producto_1 * 15) / 100;
        iva_2 = (producto_2 * 15) / 100;
        iva_3 = (producto_3 * 15) / 100;
        total_iva1 = iva_1 + producto_1;
        total_iva2 = iva_2 + producto_2;
        total_iva3 = iva_3 + producto_3;
        valor_total = total_iva1 + total_iva2 + total_iva3;
        //La condicion de Switch
        System.out.println("1. Lunes 5% de Descuento\n" +
                "2. Martes 10% de Descuento\n" +
                "3. Miércoles No hay Descuentos\n" +
                "4. Jueves 20% de Descuentos\n" +
                "5. Viernes 30% de Descuento\n" +
                "6. Sábado 45% de Descuento\n" +
                "7. Domingo 50% de Descuento");
        System.out.print("Ingrese el dia usando 1,2,3,4,5,6,7: ");
        int dia = entrada.nextInt();
        String El_dia;
        switch (dia) {
            case 1:
                El_dia = "Lunes";
                if (valor_total > 100) {
                    valor_total = (valor_total * 5) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 5% es de: "+ " $"+valor_total);
                }
                break;
            case 2:
                El_dia = "Martes";
                if (valor_total > 150) {
                    valor_total = (valor_total * 10) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 10% es de: "+ " $"+valor_total);
                }
                break;
            case 3:
                El_dia = "Miercoles";
                break;
            case 4:
                El_dia = "Jueves";
                if (valor_total > 200) {
                    valor_total = (valor_total * 20) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 20% es de: "+ " $"+valor_total);
                }
                break;
            case 5:
                El_dia = "Viernes";
                if (valor_total > 300) {
                    valor_total = (valor_total * 30) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 30% es de: "+ " $"+valor_total);
                }
                break;
            case 6:
                El_dia = "Sabado";
                if (valor_total > 350) {
                    valor_total = (valor_total * 45) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 45% es de: "+ " $"+valor_total);
            }
                break;
            case 7:
                El_dia = "Domingo";
                if (valor_total > 500) {
                    valor_total = (valor_total * 50) / 100;
                    System.out.println("Los productos de \n"
                            +name_producto_1+ " con iva es de: $"+ total_iva1+"\n"
                            +name_producto_2+ " con iva es de: $"+ total_iva2+"\n"
                            +name_producto_3+ " con iva es de: $"+ total_iva3+"\n"
                            +" El descuento es del 50% es de: "+ " $"+valor_total);
            }
        }
    }
}