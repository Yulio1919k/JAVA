package EJERCICIO1;

public class Nodo {
    String Datos;
    Nodo Sigue;
    //Constructor
    public Nodo(){
        this.Datos = "";
        this.Sigue = null;
    }
    public Nodo(String Datos, Nodo Sigue){
        this.Datos = Datos;
        this.Sigue = Sigue;
    }
    //Getter y Setter
    public String GetDatos(){
        return Datos;
    }
    public void SetDatos(String Datos){
        this.Datos = Datos;
    }
    public Nodo GetSigue(){
        return Sigue;
    }
    public void SetSigue(Nodo Sigue){
        this.Sigue = Sigue;
    }
}
