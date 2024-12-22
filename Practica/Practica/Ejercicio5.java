package Practica;
import java.util.Scanner;
public class Ejercicio5 {
        public static void main(String[] args) {
        /*
         * Diseñe un programa en Java que permita el ingreso de 10 números
         * y muestre los datos ingresados de forma ascendente.
         */
            Scanner entrada = new Scanner(System.in);
            int[]  numb = new int[10];
            for(int a = 0; a<10; a++){ 
            System.out.print("Ingrese el numero "+(a+1)+":");
            numb[a] = entrada.nextInt();
}
           for(int a= 0; a < numb.length - 1; a++){
                for(int b = 0; b<numb.length - 1 - a; b++){
                    if (numb[b] > numb[b+1]) {
                        int agua = numb[b];
                        numb[b] = numb[b+1];
                        numb[b+1] = agua;
}
}
}
           System.out.println("NUMEROS ORDENADO DE FORMA ASCENDENTE");
           for(int c = 0; c < numb.length - 1; c++){
                System.out.println(numb[c]);
}
           /* 
            System.out.println("NUMEROS ORDENADO DE FORMA DESCENDENTE");
           for(int c = numb.length - 1; c >= 0; c--){
                System.out.println(numb[c]);
           */
            entrada.close();
}
}

