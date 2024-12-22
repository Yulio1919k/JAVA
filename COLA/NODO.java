public class NODO {
    private int datos;
    private NODO siguiente;

    // Constructor por defecto
    public NODO() {
        this.datos = 0;
        this.siguiente = null;
    }

    // Constructor con parámetros
    public NODO(int datos, NODO siguiente) {
        this.datos = datos;
        this.siguiente = siguiente;
    }

    // Métodos Getter y Setter
    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public NODO getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NODO siguiente) {
        this.siguiente = siguiente;
    }
}
