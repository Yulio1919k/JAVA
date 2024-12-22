package EJERCICIO4;

public class Pila {
    Nodo Cima;

    // Constructor
    public Pila() {
        this.Cima = null;
    }
    public Pila(Nodo Cima){
        this.Cima = Cima;
    }
    public boolean PilaVacia() {
        return Cima == null;
    }

    // Apilar
    public void Apilar(int Valor) {
        Nodo nuevo = new Nodo(Valor);
        if (PilaVacia()) {
            Cima = nuevo;
        } else {
            nuevo.SetSigue(Cima);
            Cima = nuevo;
        }
    }

    // Imprimir los números en texto
    public void Imprimir() {
        Nodo actual = Cima;
        while (actual != null) {
            int numero = actual.GetDatos();
            System.out.println(numero + " " + ConvertirEnTexto(numero));
            actual = actual.GetSigue();
        }
    }

    // Convertir número a texto
    public String ConvertirEnTexto(int numero) {
        String[] textos = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco",
                           "Seis", "Siete", "Ocho", "Nueve", "Diez"};
        return textos[numero];
    }
}
