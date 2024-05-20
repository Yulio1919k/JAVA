import javax.swing.JOptionPane;
public class Ejercicio_1 {
    public static void main(String[] args) {
        // Para guardar los arrays
        int[] par = new int[10];
        int[] impar = new int[10];
        int enumerar_par = 0;
        int enumerar_impar = 0;

        // For repetitivo para ingresar los 10 numeros
        for (int a = 0; a < 10; a++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: (" + (a + 1) + "/10)"));
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Ese número tiene ser positivo");
                a--;
            } else if (numero % 2 == 0) {
                par[enumerar_par] = numero;
                enumerar_par++;
            } else {
                impar[enumerar_impar] = numero;
                enumerar_impar++;
            }
        }

        // Los Arrays
        // Array de Pares
        String par_cadena = "Numeros par: [";
        for (int a = 0; a < enumerar_par; a++) {
            par_cadena += par[a];
            if (a < enumerar_par - 1) {
                par_cadena += ", ";
            }
        }
        par_cadena += "]";

        // Array impares
        String impar_cadena = "Numeros impar: [";
        for (int a = 0; a < enumerar_impar; a++) {
            impar_cadena += impar[a];
            if (a < enumerar_impar - 1) {
                impar_cadena += ", ";
            }
        }
        impar_cadena += "]";

        JOptionPane.showMessageDialog(null, par_cadena + "\n" + impar_cadena);
    }
}
