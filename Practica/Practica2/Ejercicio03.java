package Practica2;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombre = new String[10];
        String[] apellido = new String[10];
        float[] Sueldo = new float[10];
        float[] Bono = new float[10];
        Byte[] Hijos = new Byte[10];
        Byte[] Hora_extras = new Byte[10];
        Byte[] xHora_extras = new Byte[10];
        Byte[] xHijos = new Byte[10];
        float[] total = new float[10];
        for (int i = 0; i < 2; i++) {
            System.out.print("Nombre del empleado "+(i+1)+": ");
            nombre[i] = entrada.nextLine();
            System.out.print("Apellido del empleado "+(i+1)+": ");
            apellido[i] = entrada.nextLine();
            System.out.print("Sueldo del empleado "+(i+1)+": ");
            Sueldo[i] = entrada.nextFloat();
            System.out.print("Cuantos Hijos tiene el empleado "+(i+1)+": ");
            Hijos[i] = entrada.nextByte();
            System.out.print("Cuantas Horas extras tiene el empleado ");
            Hora_extras[i] = entrada.nextByte();
        
        entrada.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            if (Sueldo[i]>500) {
                Bono[i] = (float) (Sueldo[i]*0.10);
            }else{
                Bono[i]=0; 
            }
            if (Hijos[i]>0) {
                xHijos[i] = (byte) (Hijos[i]*20);
            }else{
                xHijos[i]=0;
            }
            if (Hora_extras[i]>0) {
                xHora_extras[i] = (byte) (Hora_extras[i]*4); 
            }else{
                xHora_extras[i]=0;
            }
        }
        for (int i = 0; i < 2; i++) { 
        total[i] = Sueldo[i] + Bono[i] + xHora_extras[i] + xHijos[i];
        System.out.println("El Sr. "+nombre[i]+" "+apellido[i]+" Su sueldo es de "+Sueldo[i]+
        " con el Bono de "+Bono[i]+"\n"+" su adicional de hijos es "+xHijos[i]+" sus horas extras de "
        +xHora_extras[i]+" El total es de: "+total[i]);
        }
    }
}
