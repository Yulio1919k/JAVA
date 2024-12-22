public class Cola_Main {
    public static void main(String[] args) {
        COLA cola = new COLA();

        // Operaciones en la cola
        cola.Encolar(8);
        cola.Encolar(20);
        cola.Encolar(30);

        System.out.println("Contenido inicial de la cola:");
        cola.ImprimirCola();

        int x = cola.Desencolar();
        System.out.println("Número desencolado: " + x);

        System.out.println("Contenido de la cola después de desencolar:");
        cola.ImprimirCola();
    }
}
