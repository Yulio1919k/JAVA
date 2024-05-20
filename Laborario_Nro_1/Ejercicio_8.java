package Laborario_Nro_1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio_8 {
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formato);
        System.out.println("La fecha y hora actual del sistema es: " + fechaHoraFormateada);
    }
}