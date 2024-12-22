package Garaje;

public class Cola {
    Nodo principio;
    Nodo finalizar;
    // Constructor por defecto
    public Cola() {
        this.principio = null;
        this.finalizar = null;
    }
    public boolean estaVacia() {
        return principio == null;
    }
    public void Encolar(Vehiculo datos) {
        Nodo nuevo = new Nodo();
        nuevo.setDatos(datos);
        nuevo.setSigue(null);

        if (estaVacia()) {
            principio = nuevo;
            finalizar = nuevo;
        } else {
            finalizar.setSigue(nuevo);
            finalizar = nuevo;
        }
    }
    public Vehiculo Desencolar() {
        if (!estaVacia()) {
            return null;
        } else {
            Vehiculo datos = principio.getDatos();
            principio = principio.getSigue();
            if (principio == null) {
                finalizar = null;
            }
            return datos;
        }
    }
    public void ImprimirCola() {
        if (!estaVacia()) {
        } else {
            Nodo actual = principio;
            while (actual != null) {
                actual = actual.getSigue();
            }
            System.out.println();
        }
        System.out.println();
    }
}
    

