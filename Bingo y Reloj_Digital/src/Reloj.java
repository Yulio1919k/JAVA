import java.util.Scanner;
public class Reloj {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        int hora = entrada.nextInt();
        System.out.print("Ingrese la minutos: ");
        int minuto = entrada.nextInt();
        System.out.print("Ingrese los segundos: ");
        int segundos = entrada.nextInt();
        while (true) {
            System.out.println("--__----------");
            System.out.println("%02d:%02d:%02d".formatted(hora, minuto, segundos));
            segundos++;
            if (segundos > 59) {
                segundos = 0;
                minuto++;
            }
            if (minuto > 59) {
                minuto = 0;
                hora++;
            }
            if (hora > 23) {
                hora = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}