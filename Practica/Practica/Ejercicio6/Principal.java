package Practica.Ejercicio6;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Padre> gente = new ArrayList<>();
            /*
             * Diseñe un programa en Java que permita el ingreso 
             * de los datos personales de 5 personas, estos datos son: 
             * Nombres, apellidos, edad y dirección, 
             * finalmente muestre los datos ingresados ordenados de forma 
             * descendente de acuerdo a la edad.
             */
        for (int i = 0; i < 2; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
            String apellido = JOptionPane.showInputDialog(null, "Apellidos: ");
            String direccion = JOptionPane.showInputDialog(null, "Dirección: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));

            gente.add(new Padre(nombre, apellido, direccion, edad));
        }
        for (int i = 0; i < gente.size() - 1; i++) {
                for (int j = i + 1; j < gente.size(); j++) {
                    if (gente.get(i).Edad < gente.get(j).Edad) {
                        Padre temp = gente.get(i);
                        gente.set(i, gente.get(j));
                        gente.set(j, temp);
                    }
                }
            }
        String mensaje = "";
        for (Padre persona : gente) {
            mensaje += persona.Imprimir() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}