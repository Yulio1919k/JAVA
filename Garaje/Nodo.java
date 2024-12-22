package Garaje;


public class Nodo {
    Vehiculo dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Vehiculo dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo() {

    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public Nodo getSigue() {
        return siguiente;
    }

    public void setSigue(Nodo sigue) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}