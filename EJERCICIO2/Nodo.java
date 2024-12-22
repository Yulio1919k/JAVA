package EJERCICIO2;

public class Nodo {
    int Datos;
    Nodo Sigue;
    //Constructor
    public Nodo(){
        this.Datos = 0;
        this.Sigue = null;
    }
    public Nodo(int Datos){
        this.Datos = Datos;
        this.Sigue = null;
    }
    //Getter y Setter
    public int GetDatos(){
        return Datos;
    }
    public void SetDatos(int Datos){
        this.Datos = Datos;
    }
    public Nodo GetSigue(){
        return Sigue;
    }
    public void SetSigue(Nodo Sigue){
        this.Sigue = Sigue;
    }
}