package Garaje2;

public class Pila {
    Nodo cima;

    // Constructor
    public Pila() {

        this.cima = null;
    }

    public Pila(Nodo cima) {

        this.cima = cima;
    }

    // MÉTODOS
    public boolean PilaVacia() {
        return cima == null;
    }

    public void Apilar(Vehiculo valor) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        if (PilaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSigue(cima);
            cima = nuevo;
        }
    }

    public Vehiculo Desapilar() {
        if (!PilaVacia()) {
            Vehiculo valor = cima.getDato();
            cima = cima.getSigue();
            return valor;
        } else {
            return null;
        }
    }

    public int Contar() {
        int cont = 0;
        Pila aux = new Pila();
        while (!PilaVacia()) {
            Vehiculo n = Desapilar();
            aux.Apilar(n);
            cont++;
        }
        while (!aux.PilaVacia()) {
            Apilar(aux.Desapilar());
        }
        return cont;
    }
    public Vehiculo buscar(String Placa){
        Pila aux = new Pila();
        if(PilaVacia())
            return null;
        else{
            while(!PilaVacia()){
                Vehiculo carro = Desapilar();
                String Pla = carro.getPlaca();
                if (Placa.equals(Pla)) {
                    while(!aux.PilaVacia()){
                        Apilar(aux.Desapilar());
                }
                    return carro;
                }else{
                    aux.Apilar(carro);
                }
            }
            while(!aux.PilaVacia()){
                Apilar(aux.Desapilar());
            }
            return null;
        }
    }
    public int getNumeroVehiculos() {
        return Contar();
    }

    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        Pila auxiliar = new Pila();
        while (!PilaVacia()) {
            Vehiculo vehiculo = Desapilar();
            if (vehiculo.getPlaca().equals(placa)) {
                while (!auxiliar.PilaVacia()) {
                    Apilar(auxiliar.Desapilar());
                }
                return vehiculo;
            }
            auxiliar.Apilar(vehiculo);
        }
        while (!auxiliar.PilaVacia()) {
            Apilar(auxiliar.Desapilar());
        }
        return null;
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (PilaVacia()) {
            return;
        }

        Pila aux = new Pila();
        while (!PilaVacia()) {
            Vehiculo actual = Desapilar();
            if (!actual.equals(vehiculo)) {
                aux.Apilar(actual);
            }
        }
        while (!aux.PilaVacia()) {
            Apilar(aux.Desapilar());
        }
    }

}