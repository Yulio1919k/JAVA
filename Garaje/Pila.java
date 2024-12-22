package Garaje;

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
        nuevo.setDatos(valor);
        if (PilaVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSigue(cima);
            cima = nuevo;
        }
    }

    public Vehiculo Desapilar() {
        if (!PilaVacia()) {
            Vehiculo valor = cima.getDatos();
            cima = cima.getSigue();
            return valor;
        } else {
            return null;
        }
    }

    public int Contar() {
        int cont = 0;
        Pila aux = new Pila();
        if (PilaVacia()) {
            return cont;
        } else {
            while (!PilaVacia()) {
                Vehiculo n = Desapilar();
                aux.Apilar(n);
                cont++;
            }
            while (aux.PilaVacia()){
            Apilar(aux.Desapilar());
            }
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
}