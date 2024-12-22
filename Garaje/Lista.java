package Garaje;

public class Lista {
    Nodo Cabecera;

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
    public void Final(Vehiculo valor){
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        //Lista aux = new Lista();
        if (Vacia())
            Cabecera = nuevo;
        else{
            Nodo aux = Cabecera;
            while (aux.getSigue() !=null){
                aux = aux.getSigue();
                aux.setSigue(nuevo);
            }
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
}