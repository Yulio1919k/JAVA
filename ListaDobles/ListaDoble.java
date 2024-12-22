package ListaDobles;
public class ListaDoble {
        Nodo cabeza;
        Nodo cola;

        public ListaDoble() {
            this.cabeza = null;
            this.cola = null;
        }
        public boolean ListaVacia() {
            return cabeza == null;
        }
        //Metodo Insetar al Inicio
        public void InsertarInicio(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (ListaVacia()) {
                cabeza = nuevo;
                cola = nuevo;
            } else {
                nuevo.siguiente = cabeza;
                cabeza.anterior = nuevo;
                cabeza = nuevo;
            }
        }
        //Metodo Insetar al Final
        public void InsertarFinal(int dato) {
            Nodo nuevo = new Nodo(dato);
            if (ListaVacia()) {
                cabeza = nuevo;
                cola = nuevo;
            } else {
                cola.siguiente = nuevo;
                nuevo.anterior = cola;
                cola = nuevo;
            }
        }
    public void imprimirAdelante() {
        Nodo aux = new Nodo(0);
        aux = cabeza;
        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }
        System.out.println();
    }

        public void imprimirAtras() {
            Nodo aux = new Nodo(0);
            aux = cola;
            while (aux != null) {
                System.out.print(aux.dato + " <- ");
                aux = aux.anterior;
            }
            System.out.println();
        }

        public int eliminarNodo(int dato) {
            Nodo aux = new Nodo(0);
            aux = cabeza;
            while (aux != null) {
                if (aux.dato == dato) {
                    if (aux.anterior != null) {
                        aux.anterior.siguiente = aux.siguiente;
                    } else {
                        cabeza = aux.siguiente; 
                    }
                    if (aux.siguiente != null) {
                        aux.siguiente.anterior = aux.anterior;
                    } else {
                        cola = aux.anterior; 
                    }
                    return aux.dato; 
                }
                aux = aux.siguiente; 
            }
            return -1;    
        }
    }