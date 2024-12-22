package Garaje2;

public class Lista {
    Nodo Cabecera;
    Nodo actual;

    public Lista() {
        this.Cabecera = null;
    }

    public Lista(Nodo Cabecera) {
        this.Cabecera = Cabecera;
    }
    public boolean Vacia(){
        return Cabecera == null;
    }
    //Metodos
    public void Insertar(Vehiculo valor){
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        if (Vacia())
            Cabecera = nuevo;
        else{
            nuevo.setSigue(Cabecera);
            Cabecera = nuevo;
        }
    }
    public void Final(Vehiculo valor) {
        Nodo nuevo = new Nodo(valor);
        if (Vacia()) {
            Cabecera = nuevo;
        } else {
            Nodo aux = Cabecera;
            while (aux.getSigue() != null) {
                aux = aux.getSigue();
            }
            aux.setSigue(nuevo);
        }
    }
    public void EliminaElemento(Vehiculo valor) {
        Nodo aux = new Nodo();
        if (Vacia()) {
            System.out.println("Lista Vacia");
        } else if (Cabecera.getSigue() == null && Cabecera.getDato().equals(valor)) {
            Cabecera = null;
        }else{
            aux = Cabecera;
            while(aux.getDato() !=valor){
                aux = aux.getSigue();
            }
            
        }
    }
    public void EliminarTodo(){
        Cabecera = null;

    }
    public int getNumeroVehiculos() {
        int contador = 0;
        Nodo actual = Cabecera;
        while (actual != null) {
            contador++;
            actual = actual.getSigue();
        }
        return contador;
    }

    public void ordenarVehiculosPorPlaca() {
        if (Cabecera == null || Cabecera.getSigue() == null) {
            return;
        }

        Nodo actual = new Nodo();
        Nodo siguiente = new Nodo();
        actual = Cabecera;
        siguiente = Cabecera.getSigue();
        while (actual != null) {
            siguiente = actual.getSigue();
            while (siguiente != null) {
                if (actual.getDato().getPlaca().compareTo(siguiente.getDato().getPlaca()) > 0) {
                    Vehiculo temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                }
                siguiente = siguiente.getSigue();
            }
            actual = actual.getSigue();
        }
    }
    public void eliminarVehiculoPorPlaca(String placa) {
        if (Vacia()) {
            return;
        }
        if (Cabecera.getDato().getPlaca().equals(placa)) {
            Cabecera = Cabecera.getSigue();
            return;
        }
        Nodo anterior = new Nodo(null);
        Nodo actual = new Nodo();
        actual = Cabecera;
        while (actual != null) {
            if (actual.getDato().getPlaca().equals(placa)) {
                if (anterior == null) {
                    Cabecera = actual.getSigue();
                } else {
                    anterior.setSigue(actual.getSigue());
                }
                return;
            }
            anterior = actual;
            actual = actual.getSigue();
        }
        System.out.println("No se encontró el vehículo con la placa " + placa);
    }
    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        if (Vacia()) {
            return null;
        }
        
        Nodo actual = Cabecera;
        while (actual != null) {
            if (actual.getDato().getPlaca().equals(placa)) {
                return actual.getDato();
            }
            actual = actual.getSigue();
        }
        
        return null;
    }

    public void Eliminar(Vehiculo valor) {
        if (Vacia()) {
            return;
        }
        
        if (Cabecera.getDato().equals(valor)) {
            Cabecera = Cabecera.getSigue();
            return;
        }
 
        Nodo anterior = Cabecera;
        Nodo actual = Cabecera.getSigue();
        
        while (actual != null) {
            if (actual.getDato().equals(valor)) {
                anterior.setSigue(actual.getSigue());
                return;
            }
            anterior = actual;
            actual = actual.getSigue();
        }
    }
    public Vehiculo getSiguienteVehiculo() {
        if (Vacia()) {
            return null;
        }

        if (actual == null) {
            actual = Cabecera;
        } else if (actual.getSigue() == null) {
            // Si estamos al final, volver al inicio
            actual = Cabecera;
        } else {
            actual = actual.getSigue();
        }
        
        return actual.getDato();
    }

    // Método para navegar al vehículo anterior
    public Vehiculo getAnteriorVehiculo() {
        if (Vacia()) {
            return null;
        }

        // Si estamos al inicio o es el primer nodo
        if (actual == null || actual == Cabecera) {
            // Ir al último nodo
            actual = Cabecera;
            while (actual.getSigue() != null) {
                actual = actual.getSigue();
            }
            return actual.getDato();
        }

        // Buscar el nodo anterior
        Nodo temp = Cabecera;
        while (temp.getSigue() != actual) {
            temp = temp.getSigue();
        }
        actual = temp;
        return actual.getDato();
    }

    // Método para mostrar todos los vehículos
    public void MostrarTodos() {
        if (Vacia()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        Nodo temp = Cabecera;
        int contador = 1;
        while (temp != null) {
            System.out.println("Vehículo " + contador + ":");
            System.out.println(temp.getDato().toString());
            temp = temp.getSigue();
            contador++;
        }
    }

    public boolean EliminaElemento(String placaEliminar) {
        throw new UnsupportedOperationException("Unimplemented method 'EliminaElemento'");
    }
}