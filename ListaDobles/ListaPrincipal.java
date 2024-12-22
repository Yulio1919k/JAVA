package ListaDobles;

import java.util.Scanner;

public class ListaPrincipal {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las opciones: \nOpcion 1: Insertar Inicio \nOpcion 2: Insertar Final");
        int opcion = leer.nextInt(); 
        if (opcion == 1) {
            System.out.println("Ingrese el tamaño: ");
            int tamaño = leer.nextInt();
            for (int i = 0; i < tamaño; i++) {
                
            }
            lista.InsertarInicio(2);
        } else {
           
        }
        for (int i = 0; i < args.length; i++) {
            
        }
        lista.InsertarFinal(6);
        lista.InsertarFinal(8);
        lista.InsertarFinal(10);
        lista.InsertarInicio(4);
       

        System.out.println("Lista hacia adelante:");

        lista.imprimirAdelante();

        System.out.println("Lista hacia atrás:");
        lista.imprimirAtras();

        int nodoEliminado = lista.eliminarNodo(6);
        if (nodoEliminado != -1) {
            System.out.println("El Nodo "+nodoEliminado+" Fue Eliminado");
        } else {
            System.out.println("No existe ese Nodo");
        }
        System.out.println("Nodos Actualizados:");
        System.out.println("Adelante");
        lista.imprimirAdelante();
        System.out.println("Atrás");
        lista.imprimirAtras();
    }
}
