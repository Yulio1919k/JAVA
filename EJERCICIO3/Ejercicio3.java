package EJERCICIO3;
public class Ejercicio3 {
    public static void main(String[] args) {
        Cola DonCola = new Cola();
        DonCola.encolar(5);
        DonCola.encolar(2);
        DonCola.encolar(8);
        System.out.println("Cola 1:");
        DonCola.imprimir();
        System.out.println("Desencolando: " + DonCola.desencolar());
        System.out.println("Cola 1 después de desencolar:");
        DonCola.imprimir();
    }
}
