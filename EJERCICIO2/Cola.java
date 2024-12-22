package EJERCICIO2;

public class Cola {
    Nodo inicio;
    Nodo fin;
//Constructor
    public Cola(){
        this.inicio = null;
        this.fin = null;
    }
    public Cola(Nodo inicio, Nodo fin){
        this.inicio = inicio;
        this.fin = fin;
    }
//Getter y Setter;
    public Nodo getinicio(){
        return inicio;
    }
    public void setinicio(Nodo inicio){
        this.inicio = inicio;
   } 
   public Nodo getfin(){
    return fin;
}
    public void setfin(Nodo fin){
    this.fin = fin;
} 

//ColaVacia
    public boolean colavacia(){
        return inicio == null;
    }

    //Encolar
    public void Encolar(int Valor) {
        Nodo nuevo = new Nodo(Valor);  
        if (colavacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.Sigue = nuevo;
            fin = nuevo;
        }
    }
//Desencolar
    public int Desencolar(){
        if (colavacia()) {
            return Integer.MAX_VALUE;
        } else {
            int dato = inicio.Datos;
            inicio = inicio.Sigue;
            if (colavacia()) {
                fin = null;
            }
            return dato;
        }
    }
    //Contador de los numeros
    public int contarNumero() {
        int contador = 0;
        Nodo actual = inicio;
        while (actual != null) {
            contador++;
            actual = actual.Sigue;
        }
        return contador;
    }
    //Ordamiento
    public void OrdenarAscendente() {
        int[] elementos = new int[contarNumero()];
        Cola temporal = new Cola();
        for (int i = 0; i < elementos.length; i++) {
            int valor = Desencolar();
            elementos[i] = valor;
            temporal.Encolar(valor);
        }
        for (int i = 0; i < elementos.length - 1; i++) {
            for (int j = 0; j < elementos.length - i - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
        inicio = null;
        fin = null;
        
        for (int elemento : elementos) {
            Encolar(elemento);
        }
    }
    public void Imprimir() {
        Cola temporal = new Cola();
        while (!colavacia()) {
            int valor = Desencolar();
            System.out.print(valor + " ");
            temporal.Encolar(valor);
        }
        System.out.println();
        while (!temporal.colavacia()) {
            Encolar(temporal.Desencolar());
        }
    }
    }