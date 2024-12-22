package EJERCICIO1;

public class Pila {
    Nodo Cima;
    //Constructor
    public Pila(){
        this.Cima = null;
    }
    public Pila(Nodo Cima){
        this.Cima = null;
    }
    //Getter y Setter
    public Nodo GetCima(){
        return Cima;
    }
    public void SetCima(Nodo Cima){
        this.Cima = Cima;
    }
    //Metodo Boolean
    public boolean PilaVacia(){
        return Cima == null;
    }
    //Apilar
    public void Apilar(String Valor){
        Nodo nuevo = new Nodo(Valor,null);
        if (PilaVacia()) {
            Cima = nuevo;
        } else {
            nuevo.Sigue = Cima;
            Cima = nuevo;
        }
    }
    public String Desapilar(){
        if (PilaVacia()) {
            return null; 
        } else {
            String dato = Cima.Datos; 
            Cima = Cima.Sigue; 
            return dato;
        }
    }
}


