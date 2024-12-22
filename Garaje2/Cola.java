package Garaje2;

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
        nuevo.setDato(datos);
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
        if (estaVacia()) {
            return null;
        } else {
            Vehiculo datos = principio.getDato();
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
    public int getNumeroVehiculos() {
        Nodo nuevo = new Nodo();
        int contador = 0;
        nuevo = principio;
        while (nuevo != null) {
            contador++;
            nuevo = nuevo.getSigue();
        }
        return contador;
    }

    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        Nodo actual = principio;
        while (actual != null) {
            if (actual.getDato().getPlaca().equals(placa)) {
                return actual.getDato();
            }
            actual = actual.getSigue();
        }
        return null;
    }
}

    

