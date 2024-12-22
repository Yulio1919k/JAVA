public class COLA {
    NODO principio;
    NODO finalizar;

    // Constructor por defecto
    public COLA() {
        this.principio = null;
        this.finalizar = null;
    }

    // Métodos Getter y Setter
    public NODO getPrincipio() {
        return principio;
    }

    public void setPrincipio(NODO principio) {
        this.principio = principio;
    }

    public NODO getFinalizar() {
        return finalizar;
    }

    public void setFinalizar(NODO finalizar) {
        this.finalizar = finalizar;
    }
    public boolean estaVacia() {
        return principio == null;
    }
    public void Encolar(int datos) {
        NODO nuevo = new NODO();
        nuevo.setDatos(datos);
        nuevo.setSiguiente(null);

        if (estaVacia()) {
            principio = nuevo;
            finalizar = nuevo;
        } else {
            finalizar.setSiguiente(nuevo);
            finalizar = nuevo;
        }
    }
    public int Desencolar() {
        if (!estaVacia()) {
            return Integer.MIN_VALUE;
        } else {
            int datos = principio.getDatos();
            principio = principio.getSiguiente();
            if (principio == null) {
                finalizar = null;
            }
            return datos;
        }
    }
    public void ImprimirCola() {
        if (!estaVacia()) {
        } else {
            NODO actual = principio;
            while (actual != null) {
                actual = actual.getSiguiente();
            }
            System.out.println();
        }
        System.out.println();
    }
}
