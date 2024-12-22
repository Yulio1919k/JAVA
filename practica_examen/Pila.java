package practica_examen;

public class Pila {
            NODO inicio;
//CONSTRUCTOR
public Pila(){
    this.inicio = null;
}

public Pila(NODO inicio){ 
        this.inicio = inicio;
}
//METODOS
public NODO getinicio(){
    return inicio;
}
public void setinicio(NODO inicio){
        this.inicio = inicio;
}
//VACIO
public boolean esVacia(){
    return inicio == null;
}
//PUSH
public void apilar(int valor){
    NODO nuevoxd = new NODO();
    nuevoxd.setdatos(valor);
    if(esVacia()){
        inicio = nuevoxd;
    }else{
        nuevoxd.setsigue(nuevoxd);
        inicio = nuevoxd;
    }
}
//POP
    public int desapilar () {
    if (!esVacia()) {
        int n = inicio.getdatos();
        inicio = inicio.getsigue(); 
        return n;
    } else {
            return Integer.MAX_VALUE;
    }
}












}
