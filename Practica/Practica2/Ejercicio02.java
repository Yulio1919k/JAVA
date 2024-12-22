package Practica2;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
    //Una empresa desea Almacenar los datos de sus 10 empleados 
        // Nombre
        // Apellido
        // Sueldo
    //El programa debe generar un bono a todos aquellos empleados
    // que generen mas de $500, y calculo el 10% de su sueldo
    // Genere un Vector que contenga los bonos e indique cual es el dueño
    Scanner entrada = new Scanner(System.in);
    String[] Nombres = new String[10];
    String[] Apellidos = new String[10];
    double[] Sueldo = new double[10];
    double[] Bono = new double[10];
    for (int i = 0; i < 3; i++) {
        System.out.print("Ingrese el Nombre del empleado "+(i+1)+": ");
        Nombres[i] = entrada.nextLine();
        System.out.print("Ingrese el Apellido del empleado "+(i+1)+": ");  
        Apellidos[i] = entrada.nextLine();
        System.out.print("Ingrese el Sueldo del empleado "+(i+1)+": "); 
        Sueldo[i] = entrada.nextDouble(); 
        
    entrada.nextLine();
    }   
    for (int i = 0; i < 3; i++) {
        if (Sueldo[i]>500) {
            Bono[i] = Sueldo[i]*0.10; 
        }else{
            Bono[i] = 0;
        }
    }
    for (int i = 0; i < 3; i++) {
        System.out.println("Hola Sr. "+Nombres[i]+ " "+Apellidos[i]+" su sueldo es de: "+Sueldo[i]
        +" con el Bono de "+Bono[i]);
    }
}
    }

