package Laborario_Nro_1;
public class Ejercicio_9 {
        public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] correspondingValues = {400, 300, 200, 100, 0};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " .. " + correspondingValues[i] + " .. ");
        }
        System.out.println(0);
    }
}