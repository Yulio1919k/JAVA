package EJERCICIO3;

public class Cola {
    Nodo inicio;
    Nodo fin;
    int dimension;

    // Constructor
    public Cola() {
        this.inicio = null;
        this.fin = null;
        this.dimension = 0;
    }

    public Cola(Nodo inicio, Nodo fin, int dimension) {
        this.inicio = inicio;
        this.fin = fin;
        this.dimension = dimension;
    }

    // Getter y Setter
    public Nodo getinicio() {
        return inicio;
    }

    public void setinicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getfin() {
        return fin;
    }

    public void setfin(Nodo fin) {
        this.fin = fin;
    }

    public int getdimension() {
        return dimension;
    }

    public void setdimension(int dimension) {
        this.dimension = dimension;
    }

    // Cola vacía
    public boolean colavacia() {
        return inicio == null;
    }

    // Encolar
    public void encolar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);

        if (colavacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.SetSigue(nuevoNodo);
            fin = nuevoNodo;
        }
        dimension++;
    }

    // Desencolar
    public int desencolar() {
        if (colavacia()) {
            return -1;
        }
        int elemento = inicio.GetDatos();
        inicio = inicio.GetSigue();
        dimension--;
        if (colavacia()) {
            fin = null;
        }
        return elemento;
    }

    // Imprimir
    public void imprimir() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.GetDatos() + " ");
            actual = actual.GetSigue();
        }
        System.out.println();
    }
}
