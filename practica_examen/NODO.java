package practica_examen;

public class NODO {
        int datos;
        NODO sigue;

        //CONSTRUCTOR
public NODO(){
    this.datos = 0;
    this.sigue = null;
}
public NODO(int datos, NODO sigue) {
    this.datos = datos;
    this.sigue = sigue;
}
//METODOS
public int getdatos(){
        return datos;               
}
public void setdatos(int datos){
    this.datos = datos;
}
public NODO getsigue(){
        return sigue;
}
public void setsigue(NODO sigue){
        this.sigue = sigue;
}

}

