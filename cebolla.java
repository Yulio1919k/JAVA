import java.util.Scanner;

public class cebolla{
    public static void main(String[] args) {
        //Crear un algoritmo que me permita el ingreso de una matriz
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la fila: ");
        int fila = leer.nextInt();
        System.out.print("Ingrese el tamaño de la columnas: ");
        int columnas = leer.nextInt();
        int[][] matriz = new int[fila][columnas];
        int[] sumafila = new int[fila];
       
        //for para ordenar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese los valores de la matriz "+"["+i+"]"+"["+j+"]: ");
                matriz[i][j] = leer.nextInt(); 
            }
        }
        leer.close();

        //for para el reccorido y el print
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");               
            }
            System.out.println();
        }

        //calculo de 1la fila
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                    suma += matriz[i][j]; 
            }           
                    sumafila[i]= suma;
        }
            for (int i = 0; i < sumafila.length; i++) {
                System.out.print("\nLa suma de la Fila es: "+ sumafila[i]);
         }
    }
}